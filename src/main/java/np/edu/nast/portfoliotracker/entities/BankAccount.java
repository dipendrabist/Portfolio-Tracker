package np.edu.nast.portfoliotracker.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bank_accounts")
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_account_id")
	private Long bankAccountId;

	@Column(name = "account_holder_name", nullable = false)
	private String accountHolderName;

	@Column(name = "account_number", nullable = false, unique = true)
	private String accountNumber;

	@Column(name = "dmat_number", nullable = false, unique = true)
	private String dmatNumber;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "login_id", nullable = false)
	private Long loginId;

	public BankAccount() {
		super();
	}

	public Long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDmatNumber() {
		return dmatNumber;
	}

	public void setDmatNumber(String dmatNumber) {
		this.dmatNumber = dmatNumber;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

}
