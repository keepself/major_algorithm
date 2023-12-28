import java.util.ArrayList;
import java.util.List;

public class DFSList {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] inputArr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        int node_n = inputArr.length;
        visited = new boolean[node_n];
        adjList = new ArrayList<>();
        for (int i = 0; i < node_n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : inputArr) {
            addEdge(a[0], a[1]);
        }
        System.out.println(adjList);
    }

    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }

    static void dfs(int start) {
        System.out.println(start + ",");
        visited[start] = true;
        for (int target : adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
            }

        }
    }
}