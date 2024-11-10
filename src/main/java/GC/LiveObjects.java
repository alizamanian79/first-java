package GC;

public class LiveObjects {
    static private int LiveInstance=0;

    {
        LiveInstance++;
    }


    public static int getLiveobject(){
        System.out.println(LiveInstance);
        return LiveInstance;
    }

    public void finalize(){
        LiveInstance--;
    }


    public static void main(String[] args) throws InterruptedException {
        LiveObjects live = new LiveObjects();
        new LiveObjects();
        new LiveObjects();
        new LiveObjects();
        new LiveObjects();

        getLiveobject();

        System.gc();
        Thread.sleep(1000);
        getLiveobject();



    }

}
