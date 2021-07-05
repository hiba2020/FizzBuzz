import java.util.ArrayList;
import java.util.List;

public class MainClas {

	public static void main(String[] args) {
		
		Fizz_Buzz fizzBuzz = new Fizz_Buzz();
		
		List l = new ArrayList();
		l=fizzBuzz.getFizzBuzzList();
		
		for (Object object : l) {
			System.out.println(object);
		}
		
		
	}

}
