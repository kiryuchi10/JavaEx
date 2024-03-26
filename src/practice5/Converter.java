package practice5;

public class Converter {
	public static double rate;
	public static void setRate(double rate) {
		Converter.rate=rate;
	}
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
}
