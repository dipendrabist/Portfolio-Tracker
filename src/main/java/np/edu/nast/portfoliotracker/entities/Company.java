package np.edu.nast.portfoliotracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_company")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_id")
	private Long companyId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="symbol")
	private String symbol;
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", symbol=" + symbol + "]";
	}
	public Company(Long companyId, String companyName, String symbol) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.symbol = symbol;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
