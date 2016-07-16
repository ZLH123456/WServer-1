public class VolatileStopThread extends Thread{
private boolean stop = false;
public void stopMe(){
stop=true;
}

public void run(){
int i=0;
while(!stop){
System.out.println(i++);
             }
           System.out.println("Stop thread");
}

public static void main(String args[]) throws InterruptedException{
VolatileStopThread t=new VolatileStopThread();
t.start();
Thread.sleep(1000);
t.stopMe();
Thread.sleep(1000);
}
}
