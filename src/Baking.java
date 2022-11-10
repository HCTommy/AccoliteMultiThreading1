import java.util.Arrays;

public class Baking {
    //static List<Viewer> viewers = new ArrayList<>();
    static int[] finalists = new int[]{0,0,0};

    static boolean open = false;
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        open=true;
        while (System.currentTimeMillis()-t<=300){
            new Thread(new Viewer()).start();
        }
        open=false;
        System.out.println(Arrays.toString(finalists));


    }
}
