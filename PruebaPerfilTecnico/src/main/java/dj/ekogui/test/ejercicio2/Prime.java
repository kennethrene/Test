package dj.ekogui.test.ejercicio2;

public class Prime {
	public void checkPrime(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i]))
				System.out.print(numbers[i] + " ");
		}

		System.out.println("");
	}

	public boolean isPrime(int number) {
		boolean resp = false;
		int count;

		if (number > 1) {
			count = 0;

			for (int j = 2; j <= number / 2; j++) {
				if (number % j == 0)
					count++;
			}

			if (count == 0)
				resp = true;
		}

		return resp;
	}
}