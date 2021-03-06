package NumberUility;

import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {
	public static String formatAsPercentage(double num) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(num);
	}
	public static String formatInCcurrency(double num) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(num);
	}
	public static String formatwithDecimalPlaces(double num, int digits) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(digits);
		return number.format(num);
	}
	public static int random(int min, int max) {
		Random rnd = new Random();		
		return min + rnd.nextInt(max-min+1);
	}
	public static double max(double num1, double num2) {
		return Math.max(num1, num2);
	}
	public static double min(double num1, double num2) {
		return Math.min(num1, num2);
	}

}
