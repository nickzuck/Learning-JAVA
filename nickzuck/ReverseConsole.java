class ReverseConsole{
	public static void main (String args [])
	{
		for (int i = args.length -1 ; i>=0 ; i--)
		{
			//System.out.print(args[i]) ;
			System.out.print(reverseString(args[i]));
			System.out.print(" ") ;
		}
		System.out.println() ; 
	}

	public static String reverseString(String s){
		char c[] = s.toCharArray() ; 
		int i = 0, j = c.length -1 ; 
		while (i<j){
			char tmp = c[i] ; 
			c[i] = c[j] ; 
			c[j] = tmp ; 
			i++ ; 
			j-- ;
		}
		//System.out.println(String(c));

		return new String(c); 
	}


}
