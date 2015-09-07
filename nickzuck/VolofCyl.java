import java.util.*;

class VolofCyl
{
	Scanner input = new Scanner(System.in) ;
	
	
	float r ; 
	float l ;
	public static void main (String [] args)
	{
		VolofCyl obj =new VolofCyl() ; 	
		System.out.println(obj.calculate() );
	}

	VolofCyl () 
	{
		System.out.println("Enter the radius and length of the cylinder ") ; 	
		r = input.nextFloat() ; 
		l = input.nextFloat() ;
	}
	double calculate () 
	{
		double volume =  3.14 *r*r*l  ;
		return volume ;
	}
}