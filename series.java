import java.util.Scanner;

class Series
{
    double theta , radian ; 
    Scanner scan = new Scanner(System.in) ;
    
    void convert (){
        this.radian = ((3.14)/360)*this.theta ;
        generateseries() ; 
    }
    void generateseries(){
        int n ; 
        System.out.println("Enter the point till the series is to be found ");
        n = scan.nextInt() ; 
        double ans = 0 ;
        for(int i =1  ; i<=n ;i++){
             double temp = Math.pow(-1,(double)i) * Math.pow(radian, (double)(2*i +1));
            temp /= fact(2*i +1) ;
            ans += temp ;
            System.out.println(temp) ; 
        }
        System.out.println("sin("+theta+") = " + ans ) ;
    }
    double fact(int input){
        double ans = 1 ; 
        for (int i = 2 ; i<= input ; i++){
            ans += ans*i ; 
        }
        
        return ans ; 
    }
    Series (){
        System.out.println("Enter the value of angle in theta");
        theta = scan.nextDouble() ; 
    }
    public static void main (String [] args) {
        Series obj = new Series () ; 
        obj.convert() ; 
    }
}
