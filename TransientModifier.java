class TransientModifier
{
    transient int a ;
    int b ;
    void getdata(){
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b );
    }

    void putdata(){
        a = 12 ; 
        b = 23 ;
    }
}

class MainClass{
    public static void main (String [] args){
        TransientModifier obj = new TransientModifier() ;
        obj.getdata();  
        obj.putdata() ; 
        obj.getdata(); 
    }
}
