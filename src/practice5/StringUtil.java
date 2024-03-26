package practice5;

public class StringUtil {
	private static String concat;
	public static String concatString(String[] strArray){
		for(int i=0;i<strArray.length;i++)
			concat+=strArray[i];
		return concat;
	}
}
