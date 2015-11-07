import java.util.*; 

class StringToken
{
    public static void main (String [] args){
        StringTokenizer token = new StringTokenizer("a bc def ge" , " "); 
        System.out.println("Returning number of tokens " + token.countToken());
        System.out.println("Printing every token ") ;
        while(token.hasMoreToken()){
            System.out.println(token.nextToken());
        }
    }
}
