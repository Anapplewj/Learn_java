package Pra0305_2;

import Pra0305_2.IOperations.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] oprations;
    public abstract int menue();//抽象方法只能在抽象类或者接口中存在
    public void doOperations(int choice,BookList bookList){
        oprations[choice-1].work(bookList);
    }

}
