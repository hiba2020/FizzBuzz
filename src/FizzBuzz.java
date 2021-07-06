import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private List<String> fizzBuzzList;

	public FizzBuzz() {

		fizzBuzzList = new ArrayList<String>();
		fizzBuzzMethode();
	}

	public List<String> getFizzBuzzList() {

		return fizzBuzzList;
	}

	private void fizzBuzzMethode() {

		for (int i = 1; i <= 100; i++) {
			if (((i % 5) == 0) && ((i % 3) == 0)) {
				fizzBuzzList.add("FizzBuzz");
			}

			else if ((i % 3) == 0) {
				fizzBuzzList.add("Fizz");
			}

			else if ((i % 5) == 0) {
				fizzBuzzList.add("Buzz");
			}

			else
				fizzBuzzList.add(String.valueOf(i));

		}

	}

	@Override
	public String toString() {
		return "FizzBuzz [" + fizzBuzzList + "]";
	}

}
