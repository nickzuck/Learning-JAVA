/*class Q{
    int n ; 
    boolean valuSet = false ;

    synchronized int get(){
        while(!valueSet){
            try{
                wait() ; 
            }catch(Exception e){
                System.out.println("interrupted Exception caught");
            }

            System.out.println("Got : " + n);
            valueSet = false ;
            notify() ; 
            return n ;
        }
    }

    synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }catch(Exception e){
                System.out.println("Interrrupted Exception");
            }
        }

        this.n = n ; 
        valueSet = true ; 
        System.out.println("Put : " + n);
        notify() ;
    
    }
}

class Producer implements Runnable
{
    Q q ; 
    Producer(Q q){
        this.q = q ; 
        newThread(this , "Producer").start(); 
    }

    public void run(){
        int i = 0 ; 

        while(true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q ; 

    Consumer(Q q){
        this.q = q ; 
        new Thread(this , "Consumer").start();    
    }

    public void run(){
        while(true){
            q.get() ;
        }
    }    
}

class PC{
    public static void main(String [] args){
        Q q = new Q() ; 
        new Producer(q);
        new Consumer(q) ; 
        System.out.println("Press control + c to quit");
    }
}*/

class InterThread{
    public static void main(String[] args){
    System.out.println("Press Control-C to stop");
    for(int i = 1 ; i<=5 ; i++){
        System.out.println("Put: " + i);
        System.out.println("Got: " + i);
    }
    }

}
