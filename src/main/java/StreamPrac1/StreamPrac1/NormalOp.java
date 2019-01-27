package StreamPrac1.StreamPrac1;


import java.util.*; 
import java.util.stream.*;

public class NormalOp {
	
	
	public static void main(String args[]) {
	
		
		 List<Integer> number = Arrays.asList(2,3,4,5,2); 
		 Set<Integer> square = number.stream().map(x -> x*x). 
		                           collect(Collectors.toSet());
	
		 System.out.println(square); 
	
	
		 List<Integer> a = Arrays.asList(2,3,4,5,6,7); 
		   int input=2;
		   
		   a.stream().forEach(y->{
			   if(y.intValue()==input) {
				
				   System.out.println(1); 
			   }
				   
			   
		   });
		   
		   
		   
	}
}






