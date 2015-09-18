class MultipleCatch 
{
    public static void main (String [] args ){
        try {
            int a = args.length ; 
            System.out.println ("a = " +a) ; 
            int b = 42/a ; 
            int c[] = {1} ; 
            c[32] = 99 ; 
        }
          catch (ArithmeticException e){
            System.out.println ("Error : " + e) ;           
          }
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Error : "+ e) ; 
          }
        System.out.println ("After try/catch blocks") ; 
    }
}
