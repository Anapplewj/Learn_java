package ThreadStudy;

public class Thread2 {
    private static int count;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    count++;
                }
            }
        }).start();

    }
}
