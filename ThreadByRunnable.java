/* Threads can be implemented in java by two methods :
    i) By implementing the runnable interface
    ii) By extending the thread class
*/

/*We are doing it by using the runnable interface and will be doing other things in the next few programs*/

class RunnableThread implements Runnable 
{
    Thread t ;
    RunnableThread(){ 
        t = new Thread(this , "New Thread");
        System.out.println("New Thread " + t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 1 ;i<=5 ;i++){
                System.out.println("New Thread counter" + i);
                Thread.sleep(500); //sleep for 500 miliseconds
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
            System.out.println(e) ;
        }
        System.out.println("Exiting New Thread");
    }
}

class MainClass 
{
    public static void main (String [] args){
        new RunnableThread() ;
        try {
            for(int i = 1 ;i<=5 ; i++){
                System.out.println("Main Thread counter" + i);
                Thread.sleep(200); //sleep for 200 miilliseconds
            }
        }
        catch (Exception  e){
            System.out.println("exception occured in main thread");
            System.out.println(e);
            
        }
        System.out.println("Exitiing Main thread");
    }
}
