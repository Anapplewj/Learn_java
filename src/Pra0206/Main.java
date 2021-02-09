package Pra0206;

import java.util.ArrayList;
import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
//找出id所对应的员工
//找出这个员工的下属
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result=0;
        for(int i=0;i<2000;i++){
            List<Integer> cureeID=getResult(employees,id,result);
            for(int j=0;j<2000;j++){
                getResult(employees,cureeID.get(j),result);
            }
        }
        return result;
    }
    //计算对应ID的员工的重要度，和他直系下属的重要度
    private List<Integer> getResult(List<Employee> employees, int id, int result) {
        Employee curee=curee(employees,id);
        result+=curee.importance;
        List<Integer> cureeId=curee.subordinates;
        for(int i=0;i<cureeId.size();i++){
            result+=curee(employees,i).importance;
        }
        return cureeId;
    }
    //找出对应ID是那个员工
    public static Employee curee(List<Employee> employees,int id){
        for(int i=0;i<employees.size();i++){
            Employee curee=employees.get(i);
            if(curee.id==id){
                return curee;
            }

        }
        return null;
    }
}
//[[1,5,[2,3]],[2,3,[]],[3,3,[]]]
public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=1;
        e1.importance=5;
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        e1.subordinates=list;
        Employee e2=new Employee();
        e2.id=2;
        e2.importance=3;
        e2.subordinates=null;
        Employee e3=new Employee();
        e3.id=3;
        e3.importance=3;
        e3.subordinates=null;
        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Solution solution=new Solution();
        solution.getImportance(employees,1);
    }
}
