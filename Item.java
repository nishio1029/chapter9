
public class Item {
	String name;//フィールド生成
	int price;

	public Item(String name) {//引数一つのコンストラクタ
		this.name = name;
		this.price = 0;
	}

	public Item(String name, int price) {//引数二つのコンストラクタ
		this.name = name;
		this.price = price;
	}
}
