package fleamarketapp;

public class ProductRepositry {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	private int price;
	private String label;
	private String size;
	private int good;
	private String comment;

	public ProductRepositry() {

		name = "フード付きパーカー";
		price = 1200;
		label = "ウニクロ";
		size = "フリーサイズ";
		good = 12;
		comment = "ワンポイントでロゴが入ってます。";

	}
}
