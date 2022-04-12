
	package demo;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Main_class {


		
		 // method to check first name
		
		public boolean firstName(String testString) {
			
			String regex="^[A-Z]{1}[a-z]*";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result1=match.find();
			return result1;
		

		}
	

		public boolean LastName(String testString) {
			
			String regex="^[A-Z]{1}[a-z]{2,}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result2=match.find();
			return result2;
		
	}
		
		public boolean EmailAddress(String testString) {
			
			String regex="^[a-z]*[0-9]*[a-z]*[@][a-z]*\\.[a-z]*$";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result3=match.find();
			return result3;

	}
	}
