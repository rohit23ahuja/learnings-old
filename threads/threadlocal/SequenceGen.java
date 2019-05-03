package learn.threads.threadlocal;

public class SequenceGen {
    volatile static int n = 0;  
    public static synchronized int nextNum(){
        return n++;
    }   
}
