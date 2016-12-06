package Test;
/* Hello world lamda expression example*/
public class TestHelloWorld {

	public static void main(String[] args) {
		
		HelloworldMessage message =  msg -> 
		System.out.println("Hello " + msg);
	  
		message.pringMsg("Java 8");
	   
	}

}
