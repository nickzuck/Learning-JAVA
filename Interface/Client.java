class Client implements Callback
{
    public void callback(int p) {
        System.out.println ("Callback callled with value = " + p) ; 
    }
    void noInfaceMeth(){
        System.out.println ("Classes that implement interface may also define other members , too") ;
    }
}
