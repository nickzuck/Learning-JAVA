class TestInterface
{
    public static void main (String [] args){
        Callback c = new Client () ; // Look at it again ...Found out ?? ;) 
        c.callback (12) ; 
        //c.noIfaceMeth() ;  Will give an error
        Client var = new Client () ; 
        var.noIfaceMeth() ;
            
        //Implementing interfaces to multiple classes 
        AnotherClient ob = new AnotherClient() ;
        ob.callback(12) ; 
        c = ob ; 
        System.out.println ("AFter assigning the reference to c ") ;
        c.callback (12) ; 
    }
}
