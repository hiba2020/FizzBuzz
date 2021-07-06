import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> listeFizzBuzz = new ArrayList<String>();
		listeFizzBuzz = fizzBuzz.getFizzBuzzList();

		for (String element : listeFizzBuzz) {

			System.out.println(element);
		}

	}

}
