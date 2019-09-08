package np.edu.nast.portfoliotracker.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_account_holder")
public class AccountHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_holder_id")
	private Long accountHolderId;

	@Column(name = "bank_id", nullable = false)
	private Long bankId;

	@Column(name = "account_holder_name", nullable = false)
	private String accountHolderName;

	@Column(name = "account_number", nullable = false, unique = true)
	private String accountNumber;

	public AccountHolder() {
		super();
	}

	public Long getAccountHolderId() {
		return accountHolderId;
	}

	public void setAccountHolderId(Long accountHolderId) {
		this.accountHolderId = accountHolderId;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
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

	@Override
	public String toString() {
		return "AccountHolder [accountHolderId=" + accountHolderId + ", bankId=" + bankId + ", accountHolderName="
				+ accountHolderName + ", accountNumber=" + accountNumber + "]";
	}
	

}
