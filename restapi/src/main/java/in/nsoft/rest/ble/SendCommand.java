package in.nsoft.rest.ble;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendCommand {
	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private DataDaoService dataDaoService;

	@GetMapping("/sendATcommands")
	public List<Getdata> getPublishCommand(Getdata getdata) {

		List<Getdata> list = dataRepository.findAll();

		return list;
	}

	@PostMapping("/sendATcommands")
	public ResponseEntity<Object> getAllUsers(@Valid @RequestBody Getdata getdata) throws ParseException {

		return dataDaoService.commonData(getdata);
	}

}
