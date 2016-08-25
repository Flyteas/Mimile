package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class ShopCart {

	@Id
	@Column
	private int scId;

	public int getScId() {
		return scId;
	}

	public void setScId(int scId) {
		this.scId = scId;
	}
	
	
}
