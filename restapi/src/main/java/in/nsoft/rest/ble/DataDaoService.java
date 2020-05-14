package in.nsoft.rest.ble;

import java.math.BigDecimal;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class DataDaoService {

	private static List<Getdata> getDatas = new ArrayList<>();
	private static Long userCnt = (long) 1;
	@Autowired
	private DataRepository dataRepository;
	@Autowired
	private SmartMeterRepository smartRepository;

	public List<Getdata> findAll() {
		return getDatas;
	}

	public Getdata save(Getdata getData) {
		if (getData.getId() == null) {
			getData.setId(++userCnt);
		}
		getDatas.add(getData);
		return (Getdata) getData;
	}

	public Getdata findOne(int id) {
		for (Getdata data : getDatas) {
			if (data.getId() == id) {
				return data;
			}
		}
		return null;
	}

	public ResponseEntity<Object> commonData(Getdata getdata) throws ParseException {
		Getdata savedData = dataRepository.save(getdata);
		Smartmeter meter = new Smartmeter();
		// smartRepository
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedData.getId())
				.toUri();
		byte[] decodedBytes = Base64.getDecoder().decode(getdata.getPayload());
		String decodedString = new String(decodedBytes);
		System.out.println(decodedString);
		// Inserting data into DB
		

		if (decodedString.contains("_OK_")) {
            
		} else {
			String[] ns = decodedString.split("_");
			meter.setMeterslno(ns[1]);
			// 0E_IN00008899_300320153600_0_230.00_0.0_1234.09_3.0_49.52_1234.00_12230.00_300320153600_16!
			// 31/03/2020 15:36:00
			meter.setMeterdatatime(parseDateTime(ns[2]));
			meter.setCurrent(new BigDecimal(ns[3]));
			meter.setVoltage(new BigDecimal(ns[4]));
			meter.setkW(new BigDecimal(ns[5]));
			meter.setkWh(new BigDecimal(ns[6]));
			meter.setPf(new BigDecimal(ns[7]));
			meter.setFrequency(new BigDecimal(ns[8]));
			meter.setkVAh(new BigDecimal(ns[9]));
			meter.setLoad_limit_kW(new BigDecimal(ns[10]));
			meter.setPhase(1);
			meter.setMetertype(Integer.parseInt(ns[12].substring(0, 2)));
			meter.setNodeid(getdata.getDeviceid());
			smartRepository.save(meter);
		}
		return ResponseEntity.created(uri).build();
	}

	private Date parseDateTime(String string) throws ParseException {
		// TODO Auto-generated method stub
		string = string.substring(0, 2) + "/" + string.substring(2, 4) + "/20" + string.substring(4, 6) + " "
				+ string.substring(6, 8) + ":" + string.substring(8, 10) + ":" + string.substring(10, 12);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:SS", Locale.ENGLISH);

		Date date = formatter.parse(string);

		return date;
	}

	public Getdata deleteById(int id) {
		Iterator<Getdata> iterator = getDatas.iterator();

		while (iterator.hasNext()) {
			Getdata getdata = iterator.next();
			if (getdata.getId() == id) {
				iterator.remove();
				return getdata;
			}
		}
		return null;
	}

}
