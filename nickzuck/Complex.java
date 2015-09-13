class Complex 
{
    int x ; 
    int y ; 
    Complex(int a , int b){
        x = a ; 
        y = b ; 
    }
    Complex () {
    }
    
    public static void main (String [] args){
        Complex obj = new Complex(2 , 3 ) ; 
        Complex ect = new Complex(4 , 5 ) ; 
        Complex ans = obj.sum(ect) ; 
        System.out.println("The sum of two complex numbers is "+ ans.x + " + i"+ans.y+ "\n" ) ; 
        
        
    }

    Complex sum (Complex b ) {
        Complex ans = new Complex() ; 
	//System.out.println(ans.x + "  " + ans.y) ; 
        ans.x = b.x + x ; 
        ans.y = b.y + y ; 
        return ans ;
    }
}
