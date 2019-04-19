package romanCalc;

public class PartsDefiner {

	private static String operation;
	private static String[] parts;

	public static String defineOp(String str) {
		char[] partsOfString = str.toCharArray();
		for (char c : partsOfString) {

			if (c == '+') {
				operation = "+";
			} else if (c == '-') {
				operation = "-";
			} else if (c == '/') {
				operation = "/";
			} else if (c == '*') {
				operation = "*";
			}

		}
		return operation;
	}

	public static String[] splitToParts(String s) {

		return parts = s.split("\\W");

	}

	public static String getOperation() {
		return operation;
	}

	public static String[] getParts() {
		return parts;
	}

}
