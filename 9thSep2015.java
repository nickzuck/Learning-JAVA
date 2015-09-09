class Except
{
    public static void main (String [] args) {
        try {
            System.out.println("We are calling the function\n") ; 
            callhim() ;
        }
        catch (Exception a){
            System.out.println ("You got this exception  "+ a) ; 
        }
    }
    
    static void callhim()
    {
        int a = 24 ;  
        int b= 0; 
        int ans = a/b ; 
        System.out.println("The answer is " + ans ) ; 
    }
    inline void testing(){
        System.out.println("We are testing the inline") ;
    }
}


