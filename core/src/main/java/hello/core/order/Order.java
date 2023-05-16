package hello.core.order;

public class Order {

	private Long memberId;
	private String itemNamge;
	private int itemPrice;
	private int discountPrice;
	
	public Order(Long memberId, String itemNamge, int itemPrice, int discountPrice) {
		super();
		this.memberId = memberId;
		this.itemNamge = itemNamge;
		this.itemPrice = itemPrice;
		this.discountPrice = discountPrice;
	}
	
	public int calculaterPrice() {
		return itemPrice - discountPrice;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getItemNamge() {
		return itemNamge;
	}

	public void setItemNamge(String itemNamge) {
		this.itemNamge = itemNamge;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Override
	public String toString() {
		return 
				"Order [memberId=" + memberId + 
				", itemNamge=" + itemNamge + '\'' + 
				", itemPrice=" + itemPrice +
				", discountPrice=" + discountPrice + "]";
	}
	
	
}
