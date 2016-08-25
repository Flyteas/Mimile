package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class ReturnRecard {
	
	@Id
	@Column
	private int rrId;
	@Column(length=256)
	private String rrReason;
	
	
	public int getRrId() {
		return rrId;
	}
	public void setRrId(int rrId) {
		this.rrId = rrId;
	}
	
	
	public String getRrReason() {
		return rrReason;
	}
	public void setRrReason(String rrReason) {
		this.rrReason = rrReason;
	}
	
	

}
