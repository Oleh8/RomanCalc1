package romanCalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		PartsDefiner.splitToParts(str);

		String str1 = PartsDefiner.getParts()[0];
		String str2 = PartsDefiner.getParts()[1];
		String operation = PartsDefiner.defineOp(str);

		if (CheckForInteger.isInt(str1) && CheckForInteger.isInt(str2)) {
			System.out.println(DoMath.calculate(Integer.parseInt(str1), operation, Integer.parseInt(str2)));
		} else {
			System.out.println(RomanNums.toRoman(
					DoMath.calculate(DecimalNums.romanToDecimal(str1), operation, DecimalNums.romanToDecimal(str2))));

		}

	}

}
