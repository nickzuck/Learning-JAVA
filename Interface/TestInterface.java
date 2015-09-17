class TestInterface
{
    public static void main (String [] args){
        Callback c = new Client () ; 
        c.callback (123 ) ; 
        Client var = new Client () ; 
        var.noIfaceMeth() ;
    }
}
