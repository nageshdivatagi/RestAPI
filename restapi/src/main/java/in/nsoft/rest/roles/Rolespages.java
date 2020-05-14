package in.nsoft.rest.roles;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.nsoft.rest.menu.Menu;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName Rolespages.java
 */

@Entity
public class Rolespages {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long roleid;
	private int id;
	private int adduser;
	private Date addeddate;

	
	protected Rolespages() {
		super();
	}

	public Rolespages(Long roleid, int id, int adduser, Date addeddate) {
		super();
		this.roleid = roleid;
		this.id = id;
		this.adduser = adduser;
		this.addeddate = addeddate;
	}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdduser() {
		return adduser;
	}

	public void setAdduser(int adduser) {
		this.adduser = adduser;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	@Override
	public String toString() {
		return "Rolespages [roleid=" + roleid + ", id=" + id + ", adduser=" + adduser + ", addeddate=" + addeddate
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addeddate == null) ? 0 : addeddate.hashCode());
		result = prime * result + adduser;
		result = prime * result + id;
		result = prime * result + ((roleid == null) ? 0 : roleid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rolespages other = (Rolespages) obj;
		if (addeddate == null) {
			if (other.addeddate != null)
				return false;
		} else if (!addeddate.equals(other.addeddate))
			return false;
		if (adduser != other.adduser)
			return false;
		if (id != other.id)
			return false;
		if (roleid == null) {
			if (other.roleid != null)
				return false;
		} else if (!roleid.equals(other.roleid))
			return false;
		return true;
	}

}
