import java.util.* ;

class Overloading
{
	Scanner scan = new Scanner(System.in) ;
	static class Demo
	{
		int x ; 
		float y ; 
		Demo ()
		{
			x = 2 ;
			y = 2.25f ;
			display() ;	
		}
		Demo(int x  , float y)
		{
			this.x = x ; 
			this.y = y; 
			display () ;
		}
		void display () 
		{
			System.out.println("x  = " + x + "y = " + y ) ;
		}
		void increment () 
		{
			x += 2 ; 
			y += 4 ;
			display () ;
		}
		void increment (int value)
		{
			x += value ; 
			y += value ;
			display () ;
		}
	}

	public static void main (String args[])
	{
		Demo d = new Demo() ;
		d.increment() ; 
		Demo obj = new Demo(2 , 6.6f) ;
		obj.increment() ; 
		obj.increment(124) ;
		
	}
}
