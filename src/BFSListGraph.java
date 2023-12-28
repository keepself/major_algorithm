import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSListGraph {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) {
        int[][] inputArr = {{0,1}, {0,2}, {1,3}, {2,3}, {2,4}};
        int node_n = 5;
        visited = new boolean[node_n];
        adjList = new ArrayList<>();
        for(int i=0; i<node_n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : inputArr){
            addEdge(a[0], a[1]);
        }

        bfs(0);
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int next = queue.poll();
            System.out.print(next + " ");
            for(int taget : adjList.get(next)){
                if(visited[taget] != true){
                    queue.add(taget);
                    visited[taget] = true;
                }
            }
        }
    }
    static void addEdge(int a, int b){
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }
}