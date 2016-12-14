public class Main {
	public static void main(String[] args) {
		Microsoft microsoft = new Microsoft();
		PC windows = microsoft.createPC();

		Apple apple = new Apple();
		PC mac = microsoft.createPC();
	}
}
