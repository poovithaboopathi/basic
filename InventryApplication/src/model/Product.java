package model;

public class Product {
	private int PRODUCTID;
	private String PRODUCTNAME;
	private int MINSELL;
	private int PRICE;
	private int QUANTITY;
	public int getPRODUCTID() {
		return PRODUCTID;
	}
	public void setPRODUCTID(int PRODUCTid) {
		PRODUCTID = PRODUCTid;
	}
	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}
	public void setPRODUCTNAME(String PRODUCTname) {
		PRODUCTNAME = PRODUCTname;
	}
	public int getMINSELL() {
		return MINSELL;
	}
	public void setMINSELL(int MINSELL) {
		MINSELL = MINSELL;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int PRICE) {
		PRICE = PRICE;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int QUANTITY) {
		QUANTITY = QUANTITY;
	}
}