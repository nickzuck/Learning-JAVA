package MyPack ;

class Balance {
    String name ;
    double bal ; 
    
    Balance (String n , double b ) {
        name = n ; 
        bal = b ;
    }

    void show (){
        if (bal < 0 )   
            System.out.println ("--->") ; 
        System.out.println (name + ": $" + bal) ; 
    }
}

class AccountBalance{
    public static void main (String [] args) {
        Balance current[] = new Balance[3] ; 
        current[0] = new Balance("Name 1 " , 123.23 ) ; 
        current[1] = new Balance ("Name 2 " ,124.13) ; 
        current[2] = new Balance ("Tom " , -123) ; 
    
    for (int i = 0 ; i<3 ; i++)
       current[i].show() ; 
    }
}
