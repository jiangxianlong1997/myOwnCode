package 图;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {

  private final Map<Vertex, List<Vertex>> adjVertex = new HashMap<>();

  public static void main(String[] args) {
    Graph<String> graph = new Graph<>();
    graph.addVertex("a");
    graph.addVertex("b");
    graph.addVertex("c");
    graph.addVertex("d");
    graph.addVertex("e");
    graph.addVertex("f");
    graph.addVertex("g");
    graph.addVertex("h");
    graph.addEdge("a", "b");
    graph.addEdge("a", "c");
    graph.addEdge("b", "c");
    graph.addEdge("d", "c");
    graph.addEdge("e", "c");
    graph.addEdge("d", "f");
    graph.addEdge("d", "g");
    graph.addEdge("e", "g");
    graph.addEdge("e", "h");
    graph.getGraph().keySet().forEach(vertex -> System.out.println(vertex.toString()));
  }

  public Map<Vertex, List<Vertex>> getGraph() {
    return adjVertex;
  }

  public void addVertex(T label) {
    adjVertex.put(new Vertex(label), new ArrayList<>());
  }

  void addEdge(T label1, T label2) {
    for (Vertex v : adjVertex.keySet()) {
      if (v.getLabel() == label1) {
        adjVertex.get(v).add(new Vertex(label2));
      }
      if (v.getLabel() == label2) {
        adjVertex.get(v).add(new Vertex(label1));
      }
    }
  }

  List<Vertex> getAdjVertices(T label) {
    List<Vertex> list = new ArrayList<>();
    for (Vertex v : adjVertex.keySet()) {
      if (v.getLabel() == label) {
        list.add(v);
      }
    }
    return list;
  }

  void bfs(Graph graph, String root) {

  }

}

