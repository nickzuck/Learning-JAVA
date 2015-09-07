public class Aneesh
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=0; count<10; i++,count++)
		{
			if(i==0)
				System.out.print("x");
			else
				System.out.print(((i%2==0)?"+":"-") + " x^" + (2*i+1) + "/" + (2*i+1) + "!");

		}

		System.out.println(sine(45));
	}

	Double sine(double degree)
	{
		double radian = degree * 3.14 / 180;
		
		

	}
}
