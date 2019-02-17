package day32;

public class Sort {
	private int bid;
	private int bprice;
	private String bnumber;
	private String bname;
	public Sort(int bid, int bprice, String bnumber, String bname) {
		super();
		this.bid = bid;
		this.bprice = bprice;
		this.bnumber = bnumber;
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Sort [bid=" + bid + ", bprice=" + bprice + ", bnumber=" + bnumber + ", bname=" + bname + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getBnumber() {
		return bnumber;
	}
	public void setBnumber(String bnumber) {
		this.bnumber = bnumber;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Sort() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
