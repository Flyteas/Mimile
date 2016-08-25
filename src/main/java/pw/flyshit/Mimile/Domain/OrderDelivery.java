package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class OrderDelivery {

	@Id
	@Column
	private int odId;
	@Column(length=32)
	private String courierNum;
	@Column
	private int courierStyte;
	@Column(length=32)
	private String receiver;
	@Column(length=256)
	private String shippingAdd;
	@Column
	private int receiverPhone;
	@Column
	private long deliveryDate;
	
	
	public int getOdId() {
		return odId;
	}
	public void setOdId(int odId) {
		this.odId = odId;
	}
	
	
	public String getCourierNum() {
		return courierNum;
	}
	public void setCourierNum(String courierNum) {
		this.courierNum = courierNum;
	}
	
	
	public int getCourierStyte() {
		return courierStyte;
	}
	public void setCourierStyte(int courierStyte) {
		this.courierStyte = courierStyte;
	}
	
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	public String getShippingAdd() {
		return shippingAdd;
	}
	public void setShippingAdd(String shippingAdd) {
		this.shippingAdd = shippingAdd;
	}
	
	
	public int getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(int receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	
	
	public long getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(long deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
	
}
