package com.company;
public class n_queen {
    static int count = 0;

    public static void isNqueenPosssible(int maze[][],int n){
        int path[][] = new int[n][n];
        isPlaced(n,0,path);
    }


    public static void isPlaced(int n , int row,int path[][]){
        //is destination
        if( row == n){

        }
        for(int i=0;i<n;i++){
            if(isSafe(path,i,row)){
                path[i][row] = 1;
                isPlaced(n,row+1,path);
                path[i][row] = 0;
            }
        }
       
    }
    public static boolean isSafe(int path[][],int i,int row){
        int n = path.length;
        
        return true;
    }


    public static void main(String[] args){
        int n = 3;
        int maze[][] = new int[n][n];
        isNqueenPosssible(maze,n);
    }
    
}
