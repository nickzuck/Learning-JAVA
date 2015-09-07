class LarSmal
{
	public static void main (String [] args)
	{
		int small = -124645645 , max = 89235829 ; 
		for (int i = 0 ; i<args.length ; i ++) {
			int current = Integer.parseInt(args[i]) ;
			if (current < small || i == 0 ){
				small = current ;
			}
			if (current > max || i == 0 ){
				max = current ; 
			}
		}

		System.out.println("The max number in the array is  " + max) ; 
		System.out.println("The smallest number in the array is " + small) ;	
	}
}
