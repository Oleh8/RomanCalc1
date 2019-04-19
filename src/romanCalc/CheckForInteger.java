package romanCalc;

public class CheckForInteger {

	public static boolean isInt(String s) {
		boolean isInteger = false;
		try {
			Integer.parseInt(s);

			isInteger = true;
		} catch (NumberFormatException ex) {
			
		}

		return isInteger;
	}

}
