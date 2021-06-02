package ThreadStudy;

//懒汉式
public class Lazy {
    private static Lazy instance;
    private Lazy(){};
    public static Lazy getInstance(){
        if(instance==null){
            instance=new Lazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance()==getInstance());
    }
}
