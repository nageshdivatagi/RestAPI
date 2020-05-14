package in.nsoft.rest.ble;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Getdata {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String deviceid;
	private String payload;
	private Date createdate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return String.format("GetData [id=%s, deviceid=%s, payload=%s,date=%s]", id, deviceid, payload, createdate);
	}

}
