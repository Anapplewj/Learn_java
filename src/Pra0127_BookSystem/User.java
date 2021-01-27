package Pra0127_BookSystem;
import Pra0127_BookSystem.OPeration.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menue();

    public void doOperation(int choice,BookList bookList){
        IOperation operation=this.operations[choice-1];
        operation.work(bookList);
//        operations[choice-1].work(bookList);
    }
}
