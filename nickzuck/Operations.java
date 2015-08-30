import java.util.* ; 

class Operations
{
	public static void main (String [] args)
	{	
		int a , b , c, x , y ,  z ; 
		Scanner scan  = new Scanner(System.in) ; 
		System.out.println("Enter the values of a  b  c  x  y  z in the order" ) ; 
		a = scan.nextInt (); 
		b = scan.nextInt () ; 
		c = scan.nextInt (); 
		x = scan.nextInt (); 
		y = scan.nextInt (); 
		z = scan.nextInt ();
		System.out.println("The value of (a/c)z/a = " +  ((a/c)*z/a)) ;
		c++ ;
		System.out.println("The value of c++  + b /x-y  =  " + ((c+b)/x-y))  ;
	}
}