/*Exception class doesn't define methods of it's own ...It inherits the methods defined by the superclass Throwable*/
class MyException extends Exception
{
    private int detail ; 
    
    MyException(int a){
        detail = a; 
    }
    

    /*The version of toString defined by Throwable and inherited by Exception first displays the name of the exception followed by a colon which is then followed by your description ...But we need a cleaner output so we are overriding this method*/
    public String toString(){
        return "My Exception ["+ detail + "]" ; 
    }
}

class ExceptionDemo 
{
    static void compute(int a) throws MyException {
        System.out.println ("Called compute " + a);
        if (a < 10 )
            throw new MyException(a) ; 
        System.out.println ("NORMAL EXIT\n") ; 
    }
    
    public static void main (String [] args){
      try{
        compute(32) ;
        compute(1) ; 
        compute (20) ; 
      }
        catch (MyException e){
            System.out.println ("Caught " + e)  ; 
        }
    }
}
