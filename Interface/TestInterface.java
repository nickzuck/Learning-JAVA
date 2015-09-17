class TestInterface
{
    public static void main (String [] args){
        Callback c = new Client () ; // Look at it again ...Found out ?? ;) 
        c.callback (123 ) ; 
        //c.noIfaceMeth() ;  Will give an error
        Client var = new Client () ; 
        var.noIfaceMeth() ;
    }
}
