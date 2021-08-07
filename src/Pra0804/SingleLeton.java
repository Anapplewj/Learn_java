package Pra0804;

public class SingleLeton {
    //饿汉模式(线程安全),等不及被调用,在类加载的时候就初始化了,只有一份线程安全;
    // 但是存在两个缺陷
    //1. 还没有使用,就占用内存空间;
    //2. new对象的时候,可能会抛异常,如果再调用getInstance,就会出现问题
//    private static SingleLeton single=new SingleLeton();
//    private SingleLeton(){}
//    public static SingleLeton getInstance(){
//        return single;
//    }
    //懒汉模式(线程不安全),由于比较懒,你让我干活我才干,我自己不会主动的
    // 在调用的时候,如果没有初始化对象,先初始化,后面直接返回第一次创建好的对象
    //但是是线程不安全的,getInstance方法中,总共有三行代码
    //并且,singleLeton=new SingleLeton()可以分解为三行字节码指令
    //相当于并发并行的对多行共享变量的操作,所以是线程不安全的
//    private static SingleLeton singleLeton=null;
//    private SingleLeton(){}
//    public static SingleLeton getInstance(){
//        if(singleLeton==null){
//            singleLeton=new SingleLeton();
//        }
//        return singleLeton;
//    }

    //懒汉模式+sychronized(线程安全,但是效率差)
//    private static SingleLeton singleLeton=null;
//    private SingleLeton(){}
//    private synchronized static SingleLeton getInstance(){
//        if(singleLeton==null){
//            singleLeton=new SingleLeton();
//        }
//        return singleLeton;
//    }
    //懒汉模式+双重校验锁(线程安全,而且效率高)
    private static volatile SingleLeton singleLeton=null;
    private SingleLeton(){}
    public static SingleLeton getInstance(){
        if(singleLeton==null){
            synchronized (SingleLeton.class){
                singleLeton=new SingleLeton();
            }
        }
        return singleLeton;
    }
}
