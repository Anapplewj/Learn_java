package Pra0517;

import java.util.ArrayList;
import java.util.Scanner;

//迷宫问题
class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            //搜索最短路径
            ArrayList<Node> path=new ArrayList<>();
            ArrayList<Node> minPath=new ArrayList<>();
            int[][] book=new int[n][m];
            getMinPath(arr,n,m,0,0,book,path,minPath);

            //输出最短路径
            for(Node node:minPath){
                System.out.println(node.x+","+node.y);
            }
        }
    }

    //arr[][]迷宫矩阵,row,col
    //x,y当前位置
    //book:标记矩阵,标记当前位置是否走过
    //path 保存当前路径的每一个位置
    //minPath 保存最短路径
    private static void getMinPath(int[][] arr,int row,int col,int x,int y,int[][] book,
                                   ArrayList<Node> path,ArrayList<Node> minPath){
        //判断当前位置是否越界,是否走过,是否为障碍
        if(x<0||x>=row||y<0||y>=col||
                book[x][y]==1||arr[x][y]==1){
            return;
        }
        //把当前位置存入路径
        path.add(new Node(x,y));
        //标记当前位置
        book[x][y]=1;
        //判断当前位置是否为出口
        if(x==row-1&&y==col-1){
            if(minPath.size()>path.size()||minPath.isEmpty()){
                minPath.clear();
                for(Node node:path){
                    minPath.add(node);
                }
            }
        }
        //继续搜索(x,y)的上下左右四个方向
        getMinPath(arr,row,col,x-1,y,book,path,minPath);
        getMinPath(arr,row,col,x+1,y,book,path,minPath);
        getMinPath(arr,row,col,x,y-1,book,path,minPath);
        getMinPath(arr,row,col,x,y+1,book,path,minPath);
        //把当前位置从路径中删除,寻找新的路径
        path.remove(path.size()-1);
        book[x][y]=0;
    }
}
