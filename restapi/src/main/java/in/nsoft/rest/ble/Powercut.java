package in.nsoft.rest.ble;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Powercut {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String deviceid;
	private String status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "ConnectAndDiscon [id=" + id + ", deviceid=" + deviceid + ", staus=" + status + ", createdate="
				+ createdate + "]";
	}

}
