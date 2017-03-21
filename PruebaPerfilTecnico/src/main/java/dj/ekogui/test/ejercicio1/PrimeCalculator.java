package dj.ekogui.test.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

	public int[] getPrimes(int number) {
		List<Integer> primos = new ArrayList<Integer>();
		int count;

		if (number > 0) {

			for (int i = 1; i <= number; i++) {
				count = 0;

				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0)
						count++;
				}

				if (count == 1)
					primos.add(i);
			}
		}

		int[] resp = new int[primos.size()];

		count = 0;
		for (Integer i : primos) {
			resp[count] = i;
			count++;
		}

		return resp;
	}
}