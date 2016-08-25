package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Goods {

	@Id
	@Column
	private int goodsId;
	@Column(length=128)
	private String goodsName;
	@Column
	private String goodsPrice;
	@Column
	private String goodsAmount;
	@Column(length=1024)
	private String goodsDetail;
	@Column
	private long putOnSaleDate;
	
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	
	public String getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(String goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	
	
	public String getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	
	
	public long getPutOnSaleDate() {
		return putOnSaleDate;
	}
	public void setPutOnSaleDate(long putOnSaleDate) {
		this.putOnSaleDate = putOnSaleDate;
	}
	
	
	
}
