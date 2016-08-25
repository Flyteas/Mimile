package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class GoodsCategory {

	@Id
	@Column
	private int gcId;
	@Column(length=32)
	private String gcName;
	
	
	public int getGcId() {
		return gcId;
	}
	public void setGcId(int gcId) {
		this.gcId = gcId;
	}
	
	
	public String getGcName() {
		return gcName;
	}
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	
	
	
}
