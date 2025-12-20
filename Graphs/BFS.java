What is BFS?
  Breadth First Search (BFS) is a graph traversal algorithm that explores nodes level by level.
  It starts from a source node, visits all its immediate neighbors first, then moves to the next level of neighbors.
  BFS follows the FIFO (First In First Out) principle using a Queue.

Key Idea
  Visit all nodes at the current depth before moving to nodes at the next depth.

Where BFS is Used
  🔹 Finding the shortest path in an unweighted graph
  🔹 Level order traversal of trees
  🔹 Checking graph connectivity
  🔹 Detecting cycles in graphs
  🔹 Finding minimum number of moves (mazes, puzzles)
  🔹 Web crawling & social network analysis

BFS Algorithm (Step-by-Step)
  Create a visited array to mark visited nodes
  Create a queue
  Start from a source node (usually 0)
  Mark it visited and push it into the queue
  While the queue is not empty:
      Remove the front node
      Add it to the result
      Visit all unvisited neighbors:
          Mark them visited
          Add them to the queue

BFS Pseudocode
  BFS(Graph, start):
      create visited array
      create empty queue
      mark start as visited
      push start into queue
  
      while queue is not empty:
          node = queue.pop()
          print node
          for each neighbor of node:
              if not visited:
                  mark visited
                  push neighbor into queue

BFS Implementation
  
import java.util.*;
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        int V = adj.size();

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new ArrayDeque<>();

        // Start BFS from node 0
        visited[0] = true;
        queue.add(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsTraversal.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return bfsTraversal;
    }
}


Time Complexity (TC)
------------------------------------------
O(V + E)
V → number of vertices
E → number of edges
Each node and edge is visited once.

  
Space Complexity (SC)
------------------------------------------
O(V)
  Visited array
  Queue storing vertices
