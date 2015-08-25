class Fibonacci
{
	public static void main (String [] args){
		int n = 10 ; 
		int first = 0 , second = 1, current ; 
//		current = second ;
		
		System.out.println(first);  
		System.out.println(second) ;
		for (int i = 0 ; i<n ; i++) {
			current = first + second ; 

			System.out.println(current) ;

			first = second ; 	
			second = current ; 
		}
	}
}
