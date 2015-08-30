public class fib
{
	
	public static void main(String args[]){
		
		int first =1  , second  = 1 , current ;
		System.out.print(first + "\n") ; 
		System.out.print(second + "\n") ;
		for (int i = 0 ; i<20 ; i++){
			current = first + second ;
			System.out.print(current + "\n") ; 
			first = second ; 
			second = current ;
			
		}
		
	}
	
}