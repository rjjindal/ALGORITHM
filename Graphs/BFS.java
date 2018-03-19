import java.util.*;

class Graph{

  LinkedList<Integer> adjacencyList[];
  int v;

  Graph(int v){

    adjacencyList = new LinkedList[v];
    this.v = v;

    // thats how we init an array of
    // object
    for(int i=0;i<v;i++){

      adjacencyList[i] = new LinkedList<>();
    }
  }

  // for undirected graphs
  public void addEdge(int src, int des){

    adjacencyList[src].addFirst(des);

    adjacencyList[des].addFirst(src);
  }

  public void printGraph(){

    for(int i=0;i<v;i++){

      System.out.print("\n Adjacency list of node "+i);
      for(int n: adjacencyList[i])
        System.out.print(" >> "+n);
    }
  }

  public void bFS(int s){

    Queue<Integer> q = new LinkedList<>();
    boolean isVisited[] = new boolean[v];

    // Node start = adjacencyList.get(s);
    isVisited[s] = true;
    q.add(s);

    while(!q.isEmpty()){

      int node = q.poll();
      LinkedList<Integer> curr = adjacencyList[node];
      System.out.println(node);

      for(Integer edge: curr){

        if(!isVisited[edge]){

          isVisited[edge] = true;
          q.add(edge);
        }
      }
    }
  }
}

class BFS{
  public static void main(String[] args) {

    Graph g = new Graph(5);

    g.addEdge(0, 4);
    g.addEdge(0, 1);

    g.addEdge(1, 4);
    g.addEdge(1, 3);
    g.addEdge(1, 2);

    g.addEdge(2, 3);

    g.addEdge(3, 4);

    // g.printGraph();
    g.bFS(2);
  }
}
