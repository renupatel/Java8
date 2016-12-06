package Test;

import java.util.ArrayList;
import java.util.List;

/* Enhanced for each expression example*/
public class TestHelloWorld2 {

	public static void main(String[] args) {
		
		 List cities = new ArrayList();
			
		 cities.add("Vienna");
		 cities.add("Herndon");
		 cities.add("Reston");
		 cities.add("Fremont");
		    	
		 cities.forEach(System.out::print);
		 
		 cities.forEach(System.out::println);
	   
	}

}
