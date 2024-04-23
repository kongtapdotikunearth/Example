import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TestClass {
	public static void main(String[] args) throws Exception{
		String[] colorsArrays = {"Red", "Green", "Blue"};
		//1. for Arrays.asList()
		//List<String> colors = Arrays.asList(colorsArrays);
		
		//1. for List.of
		List<String> colors = List.of(colorsArrays);
		
		//2. for Arrays.asList()
		//colors.set(0, "Yellow");
		
		//2. for List.of
		//This value will not equal to color(0) : Yellow != Red
		colorsArrays[1] = "Yellow";
		
		
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		
		Student s = new Student("Kongtap", "M.");
		System.out.println(s.getName() + " " + s.getLastName());
		
		int x = 0;   int i = 1;
		while ( i <= 10 ) {
		   x = x + i;
		   i++;
		}
		System.out.println(x);
	}
}
