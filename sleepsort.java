import java.util.logging.Level;
import java.util.logging.Logger;


class Sleep implements Runnable{
    private int time;
    Sleep(int time){
        this.time=time;        
    }
    @Override
    public void run() {
                try {
                    Thread.sleep(time*100);
                    System.out.println(time);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SleepSort.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}

public class SleepSort {

    public static void main(String[] args) {
        final int[] arr={3,5,6,9,10};
        int  index=0;
        while(index<arr.length){
        Thread t=new Thread(new Sleep(arr[index]));
        t.start();
        
        index++;
        }
    }
}
