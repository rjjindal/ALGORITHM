import java.util.*;

class Weight{

  int weight;
  Node dest;

  Weight(int w, Node d){
    weight = w;
    dest = d;
  }
}

class Node{

  int data;
  int index;
  boolean isVisited;
  LinkedList<Weight> next;

  Node(int data, int index, LinkedList<Weight> next){

    this.data = data;
    this.index = index;
    this.next = next;
    isVisited = false;
  }
}


class Graph{

  ArrayList<Node> adjacencyList;
  int v;

  Graph(int v[], int n){

    // adjacencyList = new LinkedList[n];
    adjacencyList = new ArrayList<Node>();

    this.v = n;

    for(int i=0;i<n;i++){
      adjacencyList.add(new Node(v[i], i, new LinkedList<Weight>()));
    }
  }

  // for directed graphs
  public void addEdge(int src, int des, int w){


    Weight graphW = new Weight(w, adjacencyList.get(des));

    adjacencyList.get(src).next.addFirst(graphW);
  }

  public void printGraph(){

    for(int i=0;i<v;i++){

      System.out.print("\n Adjacency list of node "+adjacencyList.get(i).index);
      for(Weight graphW: adjacencyList.get(i).next)
        System.out.print(" >> " + graphW.dest.index + ":" + graphW.weight);
    }
  }

  public void bFS(int s){

    Queue<Node> q = new LinkedList<>();

    Node start = adjacencyList.get(s);
    start.isVisited = true;
    q.add(start);

    while(!q.isEmpty()){

      Node curr = q.poll();

      System.out.println(curr.index+" ");


      for(Weight edge: curr.next){

        if(!edge.dest.isVisited){

          adjacencyList.get(edge.dest).isVisited  = true;
          q.add(edge.dest);
        }
      }
    }
  }
}

class BasicImplimentation{

  public static void main(String[] args) {

    int v[] = {10, 11, 12, 13};

    Graph g = new Graph(v, v.length);

    // g.addEdge(0, 1, 2);
    // g.addEdge(0, 2, 2);
    //
    // g.addEdge(1, 2, 3);
    //
    // g.addEdge(2, 0, 1);
    // g.addEdge(2, 3, 1);
    //
    // g.addEdge(3, 3, 1);

    // g.printGraph();
    g.bFS(2);
  }
}
