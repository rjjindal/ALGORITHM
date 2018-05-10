
class Edge{

  int src, des;
}
class Graph{

  int v, n;
  Edge[] e;

  Graph(int V, int N){

    v = V;
    n = N;

    e = new Edge[n];

    for(int i=0;i<n;i++){
      e[i] = new Edge();
    }
  }

  int find(int parent[], int src){

    if(parent[src]==-1)
      return(src);
    return(find(parent, parent[src]));
  }

  void union(int parent[], int src, int des){

    int x = find(parent, src);
    int y = find(parent, des);

    parent[x] = y;

  }

  int isCycle(){

    int[] parent = new int[v];

    for(int i=0;i<v;i++)
      parent[i] = -1;

    for(int i=0;i<n;i++){

      int x = find(parent, e[i].src);
      int y = find(parent, e[i].des);

      if(x == y){
        return(1);
      }
      union(parent, x, y);
    }
    return(0);
  }

  public static void main(String[] args) {

/* Let us create following graph
     0
    |  \
    |    \
    1-----2 */
    int V = 3, E = 2;
    Graph graph = new Graph(V, E);

    // add edge 0-1
    graph.e[0].src = 0;
    graph.e[0].des = 1;

    // add edge 1-2
    // graph.e[1].src = 1;
    // graph.e[1].des = 2;

    // add edge 0-2
    graph.e[1].src = 0;
    graph.e[1].des = 2;

    if (graph.isCycle()==1)
        System.out.println( "graph contains cycle" );
    else
        System.out.println( "graph doesn't contain cycle" );
  }
}
