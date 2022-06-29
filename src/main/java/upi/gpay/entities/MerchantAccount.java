package upi.gpay.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "merchantaccount")
public class MerchantAccount 
{

	@Id
	@GeneratedValue
	@Column(name ="merchantaccountid")
	private int merchantAccountId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="shoptype")
	private String shopType;
	
	@Override
	public String toString() {
		return "MerchantAccount [merchantAccountId=" + merchantAccountId + ", email=" + email + ", mobile=" + mobile
				+ ", storeType=" + shopType + "]";
	}
	public int getMerchantAccountId() {
		return merchantAccountId;
	}
	public void setMerchantAccountId(int merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String storeType) {
		this.shopType = storeType;
	}
	
	
}
