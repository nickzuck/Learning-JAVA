class FibonacciRecursion
{

 
	void fibonacci(int n , int first , int second)
	{
			int current ;
			if (n == 0 )
				return ; 
			else {
				current = first + second ; 
				System.out.println(current)  ; 
				first = second  ; 
				second = current  ;  
				fibonacci (n-1 , first , second) ;
			}
	}

	public static void main (String [] args)
	{
		int n = 10 ; 
		int first = 1 ; 
		int second = 1 ; 
		System.out.println(first) ; 
		System.out.println(second) ;
		
		FibonacciRecursion obj = new FibonacciRecursion() ;
		obj.fibonacci (n-2, first , second) ;
	}
} 
