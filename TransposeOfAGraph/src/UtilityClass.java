import java.util.LinkedList;

public class UtilityClass {
	
	public static void PrintGraph(Graph graph) {
		
		for(int index = 0; index < graph.GetGraphVertices(); index++) {
			LinkedList<Integer> adjList = graph.GetAdjacencyListOfVertex(index);
			for(int adjVertexIndex = 0; adjVertexIndex < adjList.size(); adjVertexIndex++) {
				System.out.println(index+ "->"+adjList.get(adjVertexIndex));
			}
			System.out.println();
		}		
	}
	
	public static Graph GetTranspose(Graph graph) {
		if(graph == null || (graph != null && (graph.GetGraphVertices() == 0 ||
				graph.GetGraphVertices() == 1))) {
			return graph;
		}
		
		Graph newGraph = new Graph(graph.GetGraphVertices());
		
		for(int index = 0; index < graph.GetGraphVertices(); index++) {
			LinkedList<Integer> adjList = graph.GetAdjacencyListOfVertex(index);
			for(int adjVertexIndex = 0; adjVertexIndex < adjList.size(); adjVertexIndex++) {
				newGraph.SetEdge(adjList.get(adjVertexIndex), index);
			}
		}		
		
		return newGraph;
	}
}
