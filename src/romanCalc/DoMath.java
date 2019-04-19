package romanCalc;

public class DoMath {

	public static int calculate(int firstNum, String operation, int secondNum) {
		int result = 0;
		switch (operation) {
		case "+":
			result = firstNum + secondNum;
			break;
		case "-":
			result = firstNum - secondNum;
			break;
		case "*":
			result = firstNum * secondNum;
			break;
		case "/":
			result = firstNum / secondNum;
			break;
		}
		return result;

	}

}
