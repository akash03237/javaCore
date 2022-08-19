package rays.javabean;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
	public static void main(String[] args) {
		ResourceBundle rbs = ResourceBundle.getBundle("com.raystech.rb.app",new Locale("en"));
		ResourceBundle rb =  ResourceBundle.getBundle("com.raystech.rb.app",new Locale("hi"));
		System.out.println(rb.getString("greetings"));
		System.out.println(rb.getString("greeting1"));
		System.out.println(rbs.getString("greeting"));
		
	}

}
