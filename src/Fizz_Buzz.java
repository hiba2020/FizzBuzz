import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
	
	private List <String> FizzBuzzList;
	
	
 
    public Fizz_Buzz() {
		FizzBuzzList =  new ArrayList<String>();
	}
    
    

    public List<String> getFizzBuzzList() {
		//fizzBuzzMethode();
		return FizzBuzzList;
	}



	public  void fizzBuzzMethode() {
    
        for (int i = 1; i <= 100; i++) 
        {
            if (((i % 5) == 0) && ((i % 3) == 0)) {
            	FizzBuzzList.add("FizzBuzz");
            }
            else if ((i % 3) == 0) {
            	FizzBuzzList.add("Fizz");
            }
            	
            else if ((i % 5) == 0) {
            	FizzBuzzList.add("Buzz");
            }
            	
            else
                FizzBuzzList.add(String.valueOf(i));
        }
    }
    
	
	@Override
	public String toString() {
		return "Fizz_Buzz [" + FizzBuzzList + "]";
	}

    

}
