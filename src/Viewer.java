import java.util.Random;

public class Viewer implements Runnable {
    public void vote(int[] finalists){
        finalists[(int) (Math.random()*3)]+=1;
    }

    @Override
    public void run() {
        synchronized (Baking.finalists){
            if (!Baking.open){
                return;
            }
            vote(Baking.finalists);
        }
    }
}
