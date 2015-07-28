package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Item {
	protected String name;
	protected String description;
	protected Date createdOn;
	protected boolean verified;
	protected AuctionType auctionType;
	protected BigDecimal initialPrice;
	protected Date auctionStart;
	protected Date auctionEnd;
	protected User seller;
	protected Set<Bid> bids = new HashSet<Bid>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public AuctionType getAuctionType() {
		return auctionType;
	}
	public void setAuctionType(AuctionType auctionType) {
		this.auctionType = auctionType;
	}
	public BigDecimal getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}
	public Date getAuctionStart() {
		return auctionStart;
	}
	public void setAuctionStart(Date auctionStart) {
		this.auctionStart = auctionStart;
	}
	public Date getAuctionEnd() {
		return auctionEnd;
	}
	public void setAuctionEnd(Date auctionEnd) {
		this.auctionEnd = auctionEnd;
	}
	public User getSeller() {
		return seller;
	}
	public void setSeller(User seller) {
		this.seller = seller;
	}
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	
	
}
