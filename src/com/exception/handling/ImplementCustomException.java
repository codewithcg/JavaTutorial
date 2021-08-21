package com.exception.handling;

public class ImplementCustomException {

	public static void main(String[] args) throws CustomeException {

		ImplementCustomException im = new ImplementCustomException();

		try {
			im.method01("Mumbai");
		}

		catch (CustomeException e) {
			System.out.println("Take a chill pill");
		}

		catch (ArithmeticException e) {
			System.out.println("Take a chill pill- Arithmentic");
		}

	}

	public void method01(String cityName) throws CustomeException, ArithmeticException {

		if (cityName == "Delhi") {

			throw new ArithmeticException("I am a custom art exc");
			// throw new CustomeException("I don't want to live in Delhi, Its polluted");
		}

		if (cityName == "Mumbai") {
			throw new CustomeException("I don't want to live in Mumbai, Its too crowdy");
		}

		if (cityName == "UK") {
			System.out.println("I am going to the UK");
		}

		else {
			System.out.println("I am in a clean city");
		}
	}

}
