package PepCoding.Backtracking.FloodFillProblem;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();//Taking rows
        int cols = sc.nextInt();//Taking columns
        int[][] maze = new int[rows][cols];//Creating maze;
        for(int i=0 ; i<maze.length; i++){//Taking input in maze
            for(int j=0;j<maze[0].length; j++){
                maze[i][j] = sc.nextInt();
            }
        }

        floodFill(maze, 0, 0,"",new boolean[rows][cols]);//Calling the floodfill function
    }

    //Flood fill function to return all the valid paths to the destination
    public static void floodFill(int[][] maze, int rows, int cols, String psf, boolean[][] visited){

        if(rows<0 || cols<0 || rows>=maze.length || cols>=maze[0].length ||
                maze[rows][cols] == 1 || visited[rows][cols]==true){
            return;
        }else if(rows == maze.length-1 && cols==maze[0].length-1){
            System.out.println(psf);
        }
        visited[rows][cols]=true;//Mark Visited before doing any operation on the cell
        floodFill(maze, rows-1,cols,psf + "t",visited);//for going to top
        floodFill(maze, rows,cols-1,psf + "l",visited);//for going left
        floodFill(maze, rows+1,cols,psf + "d",visited);//for going down
        floodFill(maze, rows,cols+1,psf + "r",visited);//for going right
        visited[rows][cols] = false;//Mark Unvisited before Backtracking
    }


}
