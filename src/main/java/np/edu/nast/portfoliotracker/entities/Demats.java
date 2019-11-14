package np.edu.nast.portfoliotracker.entities;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_demats")
public class Demats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d_id")
	private Integer did;
	
	@Column(name = "demats_number")
	private Integer dematNumber;
	
	@Column(name = "d_pin")
	private Integer dematPin;
	
	@Column(name="available_balance")
	private BigDecimal availableBalance;
	 
    @OneToMany(mappedBy = "demats", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Purchase> purchaseList;
    
   
	@OneToMany(mappedBy = "demats", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sell> sellList;
    

public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public Integer getDematNumber() {
	return dematNumber;
}
public void setDematNumber(Integer dematNumber) {
	this.dematNumber = dematNumber;
}
public Integer getDematPin() {
	return dematPin;
}
public void setDematPin(Integer dematPin) {
	this.dematPin = dematPin;
}

public List<Purchase> getPurchaseList() {
	return purchaseList;
}
public void setPurchaseList(List<Purchase> purchaseList) {
	this.purchaseList = purchaseList;
}
public List<Sell> getSellList() {
	return sellList;
}
public void setSellList(List<Sell> sellList) {
	this.sellList = sellList;
}


public BigDecimal getAvailableBalance() {
	return availableBalance;
}
public void setAvailableBalance(BigDecimal availableBalance) {
	this.availableBalance = availableBalance;
}
@Override
public String toString() {
	return "Demats [did=" + did + ", dematNumber=" + dematNumber + ", dematPin=" + dematPin + ", availableBalance="
			+ availableBalance + ", purchaseList=" + purchaseList + ", sellList=" + sellList + ", getDid()=" + getDid()
			+ ", getDematNumber()=" + getDematNumber() + ", getDematPin()=" + getDematPin() + ", getPurchaseList()="
			+ getPurchaseList() + ", getSellList()=" + getSellList() + ", getAvailableBalance()="
			+ getAvailableBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}



}
