
package DSA;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int V;
    private LinkedList<Integer>[] adj;
    
    BFS(int v){
        V = v;
        adj = new LinkedList[v];
        for( int i=0 ; i<v ; i++)
            adj[i] = new LinkedList<>();
    }
    
  void addEdge(int v, int w){
      adj[v].add(w);
  } 
  
  void BFSs(int start){
      boolean[] visited = new boolean[V];
      Queue<Integer> queue = new LinkedList<>();
      
      visited[start] = true;
      queue.add(start);
      
      while( !queue.isEmpty()){
          int v = queue.poll();
          System.out.print( v + " ");
          
          for( int n : adj[v]){
              if( !visited[n]){
                  visited[n] = true;
                  queue.add(n);
              }
          }
      }
  } 
  public static void main(String[] args){
      BFS g = new BFS(4); 
      
      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 3);
      
      g.BFSs(0);
  }
}
