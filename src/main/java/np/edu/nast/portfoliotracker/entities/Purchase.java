package np.edu.nast.portfoliotracker.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private Long transactionId;	
	@Column(name="transaction_date")
	private String transactionDate;
	@Column(name="dmat_id")
	private String dmatId;
	@Column(name="company_id")
	private Long companyId;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="rate")
	private Integer rate;
	@Column(name="amount")
	private Long amount;
	@Column(name="commission_rate")
	private Long commissionRate;
	@Column(name="commission_amount")
	private Long commissionAmount;
	@Column(name="net_amount")
	private Long netAmount;
	@Column(name="sebo_commission")
	private Long seboCommission;
	@Column(name="effective_rate")
	private Long effectiveRate;
	@Column(name="total")
	private Long total;
	@Column(name="profile_id")
	private Long profileId;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getDmatId() {
		return dmatId;
	}
	public void setDmatId(String dmatId) {
		this.dmatId = dmatId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Number getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(Long commissionRate) {
		this.commissionRate = commissionRate;
	}
	public Long getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Long commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Long getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(Long netAmount) {
		this.netAmount = netAmount;
	}
	public Long getSeboCommission() {
		return seboCommission;
	}
	public void setSeboCommission(Long seboCommission) {
		this.seboCommission = seboCommission;
	}
	public Long getEffectiveRate() {
		return effectiveRate;
	}
	public void setEffectiveRate(Long effectiveRate) {
		this.effectiveRate = effectiveRate;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}


	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	@Override
	public String toString() {
		return "Purchase [transactionId=" + transactionId + ", transactionDate=" + transactionDate + ", dmatId="
				+ dmatId + ", companyId=" + companyId + ", quantity=" + quantity + ", rate=" + rate + ", amount="
				+ amount + ", commissionRate=" + commissionRate + ", commissionAmount=" + commissionAmount
				+ ", netAmount=" + netAmount + ", seboCommission=" + seboCommission + ", effectiveRate=" + effectiveRate
				+ ", total=" + total + ", profileId=" + profileId + "]";
	}



}
