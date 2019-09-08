package np.edu.nast.portfoliotracker.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_sell")
public class Sell {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private Long transactionId; 
	@Column(name="transaction_date")
	private Date transactionDate;
	@Column(name="dmat_id")
	private String dmatId;
	@Column(name="company_id")
	private Long companyId;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="rate")
	private Integer rate;
	@Column(name="purchase_rate")
	private Integer purchaseRate;
	@Column(name="amount")
	private Long amount;
	@Column(name="commission_rate")
	private Long commissionRate;
	@Column(name="commission_amount")
	private Long commissionAmount;
	@Column(name="capital_gain_tax")
	private Long capitalGainTax;
	@Column(name="net_amount")
	private Long netAmount;
	@Column(name="sebo_commission")
	private Long seboCommission;
	@Column(name="total")
	private Long total;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
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
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public Integer getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(Integer purchaseRate) {
		this.purchaseRate = purchaseRate;
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
	public Long getCapitalGainTax() {
		return capitalGainTax;
	}
	public void setCapitalGainTax(Long capitalGainTax) {
		this.capitalGainTax = capitalGainTax;
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
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Sell [transactionId=" + transactionId + ", transactionDate=" + transactionDate + ", dmatid="
				+ dmatId + ", companyId=" + companyId + ", quantity=" + quantity + ", rate=" + rate + ", amount="
				+ amount + ", commissionRate=" + commissionRate + ", commissionAmount=" + commissionAmount
				+ ", capitalGainTax=" + capitalGainTax + ", netAmount=" + netAmount + ", seboCommission="
				+ seboCommission + ", total=" + total + "]";
	}

	
}
