package Porject.Porject.Store;

public class Store {
	Item[] menu;
	int sales = 0;
	
	public Store() {
		menu = new Item[5];
		menu[0] = new Item("무적 낚시대", 1,000,000);
		menu[1] = new Item("황금 낚시대", 500,000);
		menu[2] = new Item("일반 낚시대", 50,000);
		menu[3] = new Item("지렁이", 30,000 );
	}

}
