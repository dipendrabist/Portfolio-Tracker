package np.edu.nast.portfoliotracker.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_sell")
public class Sell {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sell_id")
	private Long sellId;	

	@Column(name="sell_date")
	private Date sellDate;


	@Column(name="company_name")
	private String companyName;

	@Column(name="share_quantity")
	private Integer shareQuantity;

	@Column(name="share_rate")
	private Integer shareRate;

	@Column(name="effective_rate")
	private Integer effectiveRate;

	@Column(name="purchase_rate")
	private Integer purchaseRate;

	@Column(name="total_amount")
	private Integer totalAmount;

	@ManyToOne
	@JoinColumn(name = "d_id")
	private Demats demats;

	public Long getSellId() {
		return sellId;
	}

	public void setSellId(Long sellId) {
		this.sellId = sellId;
	}

	public Date getSellDate() {
		return sellDate;
	}

	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getShareQuantity() {
		return shareQuantity;
	}

	public void setShareQuantity(Integer shareQuantity) {
		this.shareQuantity = shareQuantity;
	}

	public Integer getShareRate() {
		return shareRate;
	}

	public void setShareRate(Integer shareRate) {
		this.shareRate = shareRate;
	}

	public Integer getEffectiveRate() {
		return effectiveRate;
	}

	public void setEffectiveRate(Integer effectiveRate) {
		this.effectiveRate = effectiveRate;
	}

	public Integer getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(Integer purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Demats getDemats() {
		return demats;
	}

	public void setDemats(Demats demats) {
		this.demats = demats;
	}

	public Sell(Long sellId, Date sellDate, String companyName, Integer shareQuantity, Integer shareRate,
			Integer effectiveRate, Integer purchaseRate, Integer totalAmount, Demats demats) {
		super();
		this.sellId = sellId;
		this.sellDate = sellDate;
		this.companyName = companyName;
		this.shareQuantity = shareQuantity;
		this.shareRate = shareRate;
		this.effectiveRate = effectiveRate;
		this.purchaseRate = purchaseRate;
		this.totalAmount = totalAmount;
		this.demats = demats;
	}

	public Sell() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sell [sellId=" + sellId + ", sellDate=" + sellDate + ", companyName=" + companyName + ", shareQuantity="
				+ shareQuantity + ", shareRate=" + shareRate + ", effectiveRate=" + effectiveRate + ", purchaseRate="
				+ purchaseRate + ", totalAmount=" + totalAmount + ", demats=" + demats + "]";
	}




}
