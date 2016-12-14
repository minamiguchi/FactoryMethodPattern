public class Microsoft extends Maker {
	@Override
	public PC createPC() {
		return new Windows();
	}
}
