/*Entending interfaces */ 


//Entending the interface callback 
interface ExtensionofInterface extends Callback 
{
    void printthis ();
}


class A implements ExtensionofInterface
{
    public void printthis () {
        System.out.println ("We are extending the interface") ; 
    }
    public void callback (int a ){
        System.out.println ("Paramter found = " +a);  
    }
    public static void main (String [] args) {
        A obj = new A() ; 
        obj.printthis () ;    
        obj.callback (1) ; 
    }       
}
