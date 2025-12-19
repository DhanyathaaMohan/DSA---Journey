// Depth First Search (DFS)
// Given a graph, perform Depth First Search traversal starting from a given node.
// DFS explores as far as possible along each branch before backtracking.


What is DFS?

Depth First Search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.
It’s commonly used for:
    Traversing graphs/trees
    Detecting cycles
    Finding connected components
    Topological sorting
    Path existence problems

How DFS Works (Idea)

Start from a node (source).
Mark it as visited.
Visit one unvisited neighbor.
Repeat step 3 until no unvisited neighbors remain.
Backtrack and continue.

DFS can be implemented using:
    1.Recursion (implicit stack)
    2.Explicit Stack


#USING RECURSION

import java.util.*;

class DFS {
    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
}

# USING STACK 

void dfsIterative(int start) {
    boolean[] visited = new boolean[V];
    Stack<Integer> stack = new Stack<>();

    stack.push(start);

    while (!stack.isEmpty()) {
        int node = stack.pop();

        if (!visited[node]) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }
}



Time Complexity 
  
Aspect	  |  Complexity
-----------------------------------------  
Time      |(Adjacency List)	O(V + E)
Time      |(Adjacency Matrix)	O(V²)
Space	    |O(V)
