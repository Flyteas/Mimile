package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class UserComment {

	@Id
	@Column
	private int ucId;
	@Column(length=2048)
	private String ucContent;
	
	
	public int getUcId() {
		return ucId;
	}
	public void setUcId(int ucId) {
		this.ucId = ucId;
	}
	
	
	
	public String getUcContent() {
		return ucContent;
	}
	public void setUcContent(String ucContent) {
		this.ucContent = ucContent;
	}
	
	
}
