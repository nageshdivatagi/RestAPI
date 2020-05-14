package in.nsoft.rest.ble;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Smartmeter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id = (long) 0.0;
	@Column(name = "nodeid")
	private String nodeid = "";
	@Column(name = "meterslno")
	private String meterslno = "";
	@Column(name = "phase")
	private int phase = 0;
	@Column(name = "meterdatatime")
	private Date meterdatatime = new Date();
	@Column(name = "metertype")
	private int metertype = 0;
	@Column(name = "current")
	private BigDecimal current = new BigDecimal(0);
	@Column(name = "voltage")
	private BigDecimal voltage = new BigDecimal(0);
	@Column(name = "nutralcurrent")
	private BigDecimal nutralcurrent = new BigDecimal(0);
	@Column(name = "power_on_duration_in_minutes")
	private int power_on_duration_in_minutes = 0;
	@Column(name = "load_limit_function_status")
	private int load_limit_function_status = 0;
	@Column(name = "kw")
	private BigDecimal kW = new BigDecimal(0);
	@Column(name = "kwh")
	private BigDecimal kWh = new BigDecimal(0);
	@Column(name = "pf")
	private BigDecimal pf = new BigDecimal(0);
	@Column(name = "frequency")
	private BigDecimal frequency = new BigDecimal(0);
	@Column(name = "kvah")
	private BigDecimal kVAh = new BigDecimal(0);
	@Column(name = "md_kw")
	private BigDecimal md_kW = new BigDecimal(0);
	@Column(name = "md_kva")
	private BigDecimal md_kVA = new BigDecimal(0);
	@Column(name = "kva")
	private BigDecimal kVA = new BigDecimal(0);
	@Column(name = "cumulate_tamper_count")
	private int cumulate_tamper_count = 0;
	@Column(name = "cumulate_billing_count")
	private int cumulate_billing_count = 0;
	@Column(name = "cumulate_program_count")
	private int cumulate_program_count = 0;
	@Column(name = "load_limit_kw")
	private BigDecimal load_limit_kW = new BigDecimal(0);
	@Column(name = "billingdatatime")
	private Date billingdatatime = new Date();
	@Column(name = "avg_pf")
	private BigDecimal avg_pf = new BigDecimal(0);
	@Column(name = "cumulate_kwh")
	private BigDecimal cumulate_kWh = new BigDecimal(0);
	@Column(name = "cumulate_kwh_tz1")
	private BigDecimal cumulate_kWh_tz1 = new BigDecimal(0);
	@Column(name = "cumulate_kwh_tz2")
	private BigDecimal cumulate_kWh_tz2 = new BigDecimal(0);
	@Column(name = "cumulate_kwh_tz3")
	private BigDecimal cumulate_kWh_tz3 = new BigDecimal(0);
	@Column(name = "cumulate_kwh_tz4")
	private BigDecimal cumulate_kWh_tz4 = new BigDecimal(0);
	@Column(name = "cumulate_kvah")
	private BigDecimal cumulate_kVAh = new BigDecimal(0);
	@Column(name = "cumulate_kvah_tz1")
	private BigDecimal cumulate_kVAh_tz1 = new BigDecimal(0);
	@Column(name = "cumulate_kvah_tz2")
	private BigDecimal cumulate_kVAh_tz2 = new BigDecimal(0);
	@Column(name = "cumulate_kvah_tz3")
	private BigDecimal cumulate_kVAh_tz3 = new BigDecimal(0);
	@Column(name = "cumulate_kvah_tz4")
	private BigDecimal cumulate_kVAh_tz4 = new BigDecimal(0);
	@Column(name = "billing_md_kw")
	private BigDecimal billing_md_kW = new BigDecimal(0);
	@Column(name = "billing_md_kw_datetime")
	private Date billing_md_kW_datetime = new Date();
	@Column(name = "billing_md_kva")
	private BigDecimal billing_md_kVA = new BigDecimal(0);
	@Column(name = "billing_md_kva_datetime")
	private Date billing_md_kVA_datetime = new Date();
	@Column(name = "billing_power_on_duration_in_minutes")
	private int billing_power_on_duration_in_minutes = 0;
	@Column(name = "errorcode")
	private int errorcode = 0;
	@Column(name = "day")
	private int day = 0;

	public Smartmeter() {

	}

	public Smartmeter(Long id, String nodeid, String meterslno, int phase, Date meterdatatime, int metertype,
			BigDecimal current, BigDecimal voltage, BigDecimal nutralcurrent, int power_on_duration_in_minutes,
			int load_limit_function_status, BigDecimal kW, BigDecimal kWh, BigDecimal pf, BigDecimal frequency,
			BigDecimal kVAh, BigDecimal md_kW, BigDecimal md_kVA, BigDecimal kVA, int cumulate_tamper_count,
			int cumulate_billing_count, int cumulate_program_count, BigDecimal load_limit_kW, Date billingdatatime,
			BigDecimal avg_pf, BigDecimal cumulate_kWh, BigDecimal cumulate_kWh_tz1, BigDecimal cumulate_kWh_tz2,
			BigDecimal cumulate_kWh_tz3, BigDecimal cumulate_kWh_tz4, BigDecimal cumulate_kVAh,
			BigDecimal cumulate_kVAh_tz1, BigDecimal cumulate_kVAh_tz2, BigDecimal cumulate_kVAh_tz3,
			BigDecimal cumulate_kVAh_tz4, BigDecimal billing_md_kW, Date billing_md_kW_datetime,
			BigDecimal billing_md_kVA, Date billing_md_kVA_datetime, int billing_power_on_duration_in_minutes,
			int errorcode, int day) {
		super();
		this.id = id;
		this.nodeid = nodeid;
		this.meterslno = meterslno;
		this.phase = phase;
		this.meterdatatime = meterdatatime;
		this.metertype = metertype;
		this.current = current;
		this.voltage = voltage;
		this.nutralcurrent = nutralcurrent;
		this.power_on_duration_in_minutes = power_on_duration_in_minutes;
		this.load_limit_function_status = load_limit_function_status;
		this.kW = kW;
		this.kWh = kWh;
		this.pf = pf;
		this.frequency = frequency;
		this.kVAh = kVAh;
		this.md_kW = md_kW;
		this.md_kVA = md_kVA;
		this.kVA = kVA;
		this.cumulate_tamper_count = cumulate_tamper_count;
		this.cumulate_billing_count = cumulate_billing_count;
		this.cumulate_program_count = cumulate_program_count;
		this.load_limit_kW = load_limit_kW;
		this.billingdatatime = billingdatatime;
		this.avg_pf = avg_pf;
		this.cumulate_kWh = cumulate_kWh;
		this.cumulate_kWh_tz1 = cumulate_kWh_tz1;
		this.cumulate_kWh_tz2 = cumulate_kWh_tz2;
		this.cumulate_kWh_tz3 = cumulate_kWh_tz3;
		this.cumulate_kWh_tz4 = cumulate_kWh_tz4;
		this.cumulate_kVAh = cumulate_kVAh;
		this.cumulate_kVAh_tz1 = cumulate_kVAh_tz1;
		this.cumulate_kVAh_tz2 = cumulate_kVAh_tz2;
		this.cumulate_kVAh_tz3 = cumulate_kVAh_tz3;
		this.cumulate_kVAh_tz4 = cumulate_kVAh_tz4;
		this.billing_md_kW = billing_md_kW;
		this.billing_md_kW_datetime = billing_md_kW_datetime;
		this.billing_md_kVA = billing_md_kVA;
		this.billing_md_kVA_datetime = billing_md_kVA_datetime;
		this.billing_power_on_duration_in_minutes = billing_power_on_duration_in_minutes;
		this.errorcode = errorcode;
		this.day = day;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeid() {
		return nodeid;
	}

	public void setNodeid(String nodeid) {
		this.nodeid = nodeid;
	}

	public String getMeterslno() {
		return meterslno;
	}

	public void setMeterslno(String meterslno) {
		this.meterslno = meterslno;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public Date getMeterdatatime() {
		return meterdatatime;
	}

	public void setMeterdatatime(Date meterdatatime) {
		this.meterdatatime = meterdatatime;
	}

	public int getMetertype() {
		return metertype;
	}

	public void setMetertype(int metertype) {
		this.metertype = metertype;
	}

	public BigDecimal getCurrent() {
		return current;
	}

	public void setCurrent(BigDecimal current) {
		this.current = current;
	}

	public BigDecimal getVoltage() {
		return voltage;
	}

	public void setVoltage(BigDecimal voltage) {
		this.voltage = voltage;
	}

	public BigDecimal getNutralcurrent() {
		return nutralcurrent;
	}

	public void setNutralcurrent(BigDecimal nutralcurrent) {
		this.nutralcurrent = nutralcurrent;
	}

	public int getPower_on_duration_in_minutes() {
		return power_on_duration_in_minutes;
	}

	public void setPower_on_duration_in_minutes(int power_on_duration_in_minutes) {
		this.power_on_duration_in_minutes = power_on_duration_in_minutes;
	}

	public int getLoad_limit_function_status() {
		return load_limit_function_status;
	}

	public void setLoad_limit_function_status(int load_limit_function_status) {
		this.load_limit_function_status = load_limit_function_status;
	}

	public BigDecimal getkW() {
		return kW;
	}

	public void setkW(BigDecimal kW) {
		this.kW = kW;
	}

	public BigDecimal getkWh() {
		return kWh;
	}

	public void setkWh(BigDecimal kWh) {
		this.kWh = kWh;
	}

	public BigDecimal getPf() {
		return pf;
	}

	public void setPf(BigDecimal pf) {
		this.pf = pf;
	}

	public BigDecimal getFrequency() {
		return frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getkVAh() {
		return kVAh;
	}

	public void setkVAh(BigDecimal kVAh) {
		this.kVAh = kVAh;
	}

	public BigDecimal getMd_kW() {
		return md_kW;
	}

	public void setMd_kW(BigDecimal md_kW) {
		this.md_kW = md_kW;
	}

	public BigDecimal getMd_kVA() {
		return md_kVA;
	}

	public void setMd_kVA(BigDecimal md_kVA) {
		this.md_kVA = md_kVA;
	}

	public BigDecimal getkVA() {
		return kVA;
	}

	public void setkVA(BigDecimal kVA) {
		this.kVA = kVA;
	}

	public int getCumulate_tamper_count() {
		return cumulate_tamper_count;
	}

	public void setCumulate_tamper_count(int cumulate_tamper_count) {
		this.cumulate_tamper_count = cumulate_tamper_count;
	}

	public int getCumulate_billing_count() {
		return cumulate_billing_count;
	}

	public void setCumulate_billing_count(int cumulate_billing_count) {
		this.cumulate_billing_count = cumulate_billing_count;
	}

	public int getCumulate_program_count() {
		return cumulate_program_count;
	}

	public void setCumulate_program_count(int cumulate_program_count) {
		this.cumulate_program_count = cumulate_program_count;
	}

	public BigDecimal getLoad_limit_kW() {
		return load_limit_kW;
	}

	public void setLoad_limit_kW(BigDecimal load_limit_kW) {
		this.load_limit_kW = load_limit_kW;
	}

	public Date getBillingdatatime() {
		return billingdatatime;
	}

	public void setBillingdatatime(Date billingdatatime) {
		this.billingdatatime = billingdatatime;
	}

	public BigDecimal getAvg_pf() {
		return avg_pf;
	}

	public void setAvg_pf(BigDecimal avg_pf) {
		this.avg_pf = avg_pf;
	}

	public BigDecimal getCumulate_kWh() {
		return cumulate_kWh;
	}

	public void setCumulate_kWh(BigDecimal cumulate_kWh) {
		this.cumulate_kWh = cumulate_kWh;
	}

	public BigDecimal getCumulate_kWh_tz1() {
		return cumulate_kWh_tz1;
	}

	public void setCumulate_kWh_tz1(BigDecimal cumulate_kWh_tz1) {
		this.cumulate_kWh_tz1 = cumulate_kWh_tz1;
	}

	public BigDecimal getCumulate_kWh_tz2() {
		return cumulate_kWh_tz2;
	}

	public void setCumulate_kWh_tz2(BigDecimal cumulate_kWh_tz2) {
		this.cumulate_kWh_tz2 = cumulate_kWh_tz2;
	}

	public BigDecimal getCumulate_kWh_tz3() {
		return cumulate_kWh_tz3;
	}

	public void setCumulate_kWh_tz3(BigDecimal cumulate_kWh_tz3) {
		this.cumulate_kWh_tz3 = cumulate_kWh_tz3;
	}

	public BigDecimal getCumulate_kWh_tz4() {
		return cumulate_kWh_tz4;
	}

	public void setCumulate_kWh_tz4(BigDecimal cumulate_kWh_tz4) {
		this.cumulate_kWh_tz4 = cumulate_kWh_tz4;
	}

	public BigDecimal getCumulate_kVAh() {
		return cumulate_kVAh;
	}

	public void setCumulate_kVAh(BigDecimal cumulate_kVAh) {
		this.cumulate_kVAh = cumulate_kVAh;
	}

	public BigDecimal getCumulate_kVAh_tz1() {
		return cumulate_kVAh_tz1;
	}

	public void setCumulate_kVAh_tz1(BigDecimal cumulate_kVAh_tz1) {
		this.cumulate_kVAh_tz1 = cumulate_kVAh_tz1;
	}

	public BigDecimal getCumulate_kVAh_tz2() {
		return cumulate_kVAh_tz2;
	}

	public void setCumulate_kVAh_tz2(BigDecimal cumulate_kVAh_tz2) {
		this.cumulate_kVAh_tz2 = cumulate_kVAh_tz2;
	}

	public BigDecimal getCumulate_kVAh_tz3() {
		return cumulate_kVAh_tz3;
	}

	public void setCumulate_kVAh_tz3(BigDecimal cumulate_kVAh_tz3) {
		this.cumulate_kVAh_tz3 = cumulate_kVAh_tz3;
	}

	public BigDecimal getCumulate_kVAh_tz4() {
		return cumulate_kVAh_tz4;
	}

	public void setCumulate_kVAh_tz4(BigDecimal cumulate_kVAh_tz4) {
		this.cumulate_kVAh_tz4 = cumulate_kVAh_tz4;
	}

	public BigDecimal getBilling_md_kW() {
		return billing_md_kW;
	}

	public void setBilling_md_kW(BigDecimal billing_md_kW) {
		this.billing_md_kW = billing_md_kW;
	}

	public Date getBilling_md_kW_datetime() {
		return billing_md_kW_datetime;
	}

	public void setBilling_md_kW_datetime(Date billing_md_kW_datetime) {
		this.billing_md_kW_datetime = billing_md_kW_datetime;
	}

	public BigDecimal getBilling_md_kVA() {
		return billing_md_kVA;
	}

	public void setBilling_md_kVA(BigDecimal billing_md_kVA) {
		this.billing_md_kVA = billing_md_kVA;
	}

	public Date getBilling_md_kVA_datetime() {
		return billing_md_kVA_datetime;
	}

	public void setBilling_md_kVA_datetime(Date billing_md_kVA_datetime) {
		this.billing_md_kVA_datetime = billing_md_kVA_datetime;
	}

	public int getBilling_power_on_duration_in_minutes() {
		return billing_power_on_duration_in_minutes;
	}

	public void setBilling_power_on_duration_in_minutes(int billing_power_on_duration_in_minutes) {
		this.billing_power_on_duration_in_minutes = billing_power_on_duration_in_minutes;
	}

	public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Smartmeter [id=" + id + ", nodeid=" + nodeid + ", meterslno=" + meterslno + ", phase=" + phase
				+ ", meterdatatime=" + meterdatatime + ", metertype=" + metertype + ", current=" + current
				+ ", voltage=" + voltage + ", nutralcurrent=" + nutralcurrent + ", power_on_duration_in_minutes="
				+ power_on_duration_in_minutes + ", load_limit_function_status=" + load_limit_function_status + ", kW="
				+ kW + ", kWh=" + kWh + ", pf=" + pf + ", frequency=" + frequency + ", kVAh=" + kVAh + ", md_kW="
				+ md_kW + ", md_kVA=" + md_kVA + ", kVA=" + kVA + ", cumulate_tamper_count=" + cumulate_tamper_count
				+ ", cumulate_billing_count=" + cumulate_billing_count + ", cumulate_program_count="
				+ cumulate_program_count + ", load_limit_kW=" + load_limit_kW + ", billingdatatime=" + billingdatatime
				+ ", avg_pf=" + avg_pf + ", cumulate_kWh=" + cumulate_kWh + ", cumulate_kWh_tz1=" + cumulate_kWh_tz1
				+ ", cumulate_kWh_tz2=" + cumulate_kWh_tz2 + ", cumulate_kWh_tz3=" + cumulate_kWh_tz3
				+ ", cumulate_kWh_tz4=" + cumulate_kWh_tz4 + ", cumulate_kVAh=" + cumulate_kVAh + ", cumulate_kVAh_tz1="
				+ cumulate_kVAh_tz1 + ", cumulate_kVAh_tz2=" + cumulate_kVAh_tz2 + ", cumulate_kVAh_tz3="
				+ cumulate_kVAh_tz3 + ", cumulate_kVAh_tz4=" + cumulate_kVAh_tz4 + ", billing_md_kW=" + billing_md_kW
				+ ", billing_md_kW_datetime=" + billing_md_kW_datetime + ", billing_md_kVA=" + billing_md_kVA
				+ ", billing_md_kVA_datetime=" + billing_md_kVA_datetime + ", billing_power_on_duration_in_minutes="
				+ billing_power_on_duration_in_minutes + ", errorcode=" + errorcode + ", day=" + day + "]";
	}

}
