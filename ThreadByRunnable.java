/* Threads can be implemented in java by two methods :
    i) By implementing the runnable interface
    ii) By extending the thread class
*/

/*We are doing it by using the runnable interface and will be doing other things in the next few programs*/

class RunnableThread implements Runnable 
{
    Thread t ;
    RunnableThread(){
        t = new Thread(this , "DemoThread"); //creating a new thread
        System.out.println("Child thread = "  + t); 
        t.start(); //for starting the thread 
    }
    
    public void run(){
        try{
            for(int i = 0 ; i<5 ; i++){
                System.out.println("New thread counter " + i);
            }
        } catch(InterruptedException e){
            System.out.println("New Thread interrupted");
        }
        System.out.println("Exiting new thread");
    }

}
class MainThread
{
    public static void main(String [] args){
        new RunnableThread() ; 
            try{
                for(int i = 0 ;i<5 ;i++){
                    System.out.println("Main Thrad counter " + i);
                    //Thread.sleep(1000);
                }
            }

            catch(InterruptedException  e){
                System.out.println("Main thread interrrupted");
            }
            System.out.println("Main thrad exiting");
        }
    
}
