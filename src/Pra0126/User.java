package Pra0126;

import Pra0126.Operation.IOperation;

abstract class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menue();

    public void doOperation(int choice,BookList bookList){
        IOperation operation=this.operations[choice-1];
        operation.Work(bookList);
    }
}
