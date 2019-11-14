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
@Table(name = "tbl_purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="purchase_id")
	private Long purchaseId;	
	
	@Column(name="purchase_date")
	private Date purchaseDate;

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="share_quantity")
	private Integer shareQuantity;
	
	@Column(name="share_rate")
	private Integer shareRate;

	@Column(name="effective_rate")
	private Integer effectiveRate;


	@Column(name="total_amount")
	private Integer totalAmount;

	 @ManyToOne
	    @JoinColumn(name = "d_id")
	    private Demats demats;

	public Purchase(Long purchaseId, Date purchaseDate,  String companyName, Integer shareQuantity,
			Integer shareRate, Integer effectiveRate, Integer totalAmount, Demats demats) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.companyName = companyName;
		this.shareQuantity = shareQuantity;
		this.shareRate = shareRate;
		this.effectiveRate = effectiveRate;
		this.totalAmount = totalAmount;
		this.demats = demats;
	}

	public Purchase() {
		super();
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
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

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", companyName=" + companyName
				+ ", shareQuantity=" + shareQuantity + ", shareRate=" + shareRate + ", effectiveRate=" + effectiveRate
				+ ", totalAmount=" + totalAmount + ", demats=" + demats + "]";
	}


	 

	

}
