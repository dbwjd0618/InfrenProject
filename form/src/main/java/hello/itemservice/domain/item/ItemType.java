package hello.itemservice.domain.item;

public enum ItemType {

	BOOK("도서"), FOOD("식품"), ETC("기타");

	private final String descripttion;
	
	ItemType(String description) {
		this.descripttion = description;
	}
	
	public String getDescription() {
		return descripttion;
	}
}
