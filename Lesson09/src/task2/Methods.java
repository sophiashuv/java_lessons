package task2;

public class Methods {
	double a, b;

	public Methods(double _a, double _b) {
		a = _a;
		b = _b;
	}

	public double sum(){
		methodException();
		return a + b;
	}

	public double minus(){
		methodException();
		return a - b;
	}

	public double myltiply(){
		methodException();
		return a * b;
	}

	public double div() {
		methodException();
		return a / b;
	}

	public void methodException() {
		try {
			if (a < 0 && b < 0)
				throw new IllegalArgumentException(a + " < 0 and " + b + " < 0");
			if ((a == 0 && b != 0) || (a != 0 && b == 0))
				throw new ArithmeticException(
						"(" + a + "== 0 and " + b + "!= 0) or" + "(" + a + "!= 0 and " + b + " == 0)");
			if (a == 0 && b == 0)
				throw new IllegalAccessException(a + "= 0 and " + b + "= 0");
			if (a > 0 && b > 0)
				throw new MyException();
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException: (" + e.getMessage());
		} catch (IllegalAccessException e) {
			System.err.println("IllegalAccessException: " + e.getMessage());
		} catch (MyException e) {
			System.err.println("MyException: " + e.getMessage());
		}
	}

}

