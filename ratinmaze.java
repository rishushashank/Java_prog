package com.company;
public class ratinmaze {

    public static boolean ratInmaze(int maze[][]){
        int n  = maze.length;
        int path[][] = new int[n][n];
        return(searchMaze(maze,0,0,path));
    }

    public static boolean searchMaze(int maze[][],int i,int j,int path[][]){
        int n = maze.length;
        // is valid maze
        if(i < 0 || i >= n || j < 0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        //include the cell
        path[i][j] = 1;
        //is destination
        if(i == n-1  && j == n-1){
            
            return true;
        }

        //explore further in all direction
        //top
        if(searchMaze(maze, i-1, j, path)){
            return true;
        }
        //right
        if(searchMaze(maze, i, j + 1, path)){
            return true;
        }
        //down
        if(searchMaze(maze, i + 1, j, path)){
            return true;
        }
        //left
        if(searchMaze(maze, i, j - 1, path)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int maze[][] = {{1,0,0},{1,0,0},{1,0,1}};
        boolean result = ratInmaze(maze);
        System.out.println(result);
    }
}
