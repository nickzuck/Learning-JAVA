class AnotherClient implements Callback 
{
    public void callback(int p){
        System.out.println("In AnotherClient callback") ; 
        System.out.println("p squared is = " + p*p) ; 
    }    
}
