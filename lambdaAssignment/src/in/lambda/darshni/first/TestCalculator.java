package in.lambda.darshni.first;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.setArithmeticCalc((number1, number2) -> number1 + number2);
		System.out.println("Addition is:"
				+ calc.getArithmeticCalc().calculate(20, 10));
		calc.setArithmeticCalc((number1, number2) -> number1 - number2);
		System.out.println("Substraction is:"
				+ calc.getArithmeticCalc().calculate(20, 10));
		calc.setArithmeticCalc((number1, number2) -> number1 * number2);
		System.out.println("Multiplication is:"
				+ calc.getArithmeticCalc().calculate(20, 10));
		calc.setArithmeticCalc((number1, number2) -> number1 / number2);
		System.out.println("Division is:"
				+ calc.getArithmeticCalc().calculate(20, 10));

	}

}
