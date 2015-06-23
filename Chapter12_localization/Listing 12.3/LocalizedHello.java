import java.util.*;

public class LocalizedHello {
	public static void main(String args[]) {
		Locale currentLocale = Locale.getDefault(); 
		ResourceBundle resBundle = 
ResourceBundle.getBundle("ResourceBundle", currentLocale);
		System.out.printf(resBundle.getString("Greeting")); 
	}
}