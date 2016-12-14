public class Apple extends Maker {
	@Override
	public PC createPC() {
		return new Mac();
	}
}
