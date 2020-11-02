
public class SuperHero extends Hero {
	boolean flying;

	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	//戦う

	//	public void attack(Matango m) {
	//		System.out.println(this.name + "の攻撃！");
	//		m.hp -= 5;
	//		System.out.println("5ポイントのダメージを与えた");
	//	}
	//
	//	//逃げる
	//	public void run() {
	//		System.out.println(this.name + "は逃げ出した！");
	//	}

	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println(this.name + "は撤退した！");
	}

	public void attack(Matango m) {
		//		System.out.println(this.name + "の攻撃！");
		//		m.hp -= 5;
		//		System.out.println("5ポイントのダメージを与えた");
		//		if (this.flying) {//もしflyingがtrueなら…
		//			System.out.println(this.name + "の攻撃！");
		//			m.hp -= 5;
		//			System.out.println("5ポイントのダメージを与えた");
		//		} //if

		super.attack(m);//親インスタンス部分のattack()を呼び出し
		if (this.flying) {//もし飛んでたら繰り返す
			super.attack(m);//親インスタンス部分のattack()を呼び出し
		} //attack
	}//attack

}