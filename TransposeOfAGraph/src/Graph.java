import java.util.LinkedList;

public class Graph {
	private int numberOfVertices;
	private LinkedList<Integer>[] adjacencylist;
	
	public Graph(int vertexCount) {
		this.numberOfVertices = vertexCount;
		this.adjacencylist = new LinkedList[this.numberOfVertices];
		for(int index = 0; index < this.numberOfVertices; index++) {
			this.adjacencylist[index] = new LinkedList<Integer>();
		}
	}
	
	public int GetGraphVertices() {
		return this.numberOfVertices;
	}
	
	public LinkedList<Integer>[] GetGraphAdjacencyList(){
		return this.adjacencylist;
	}
	
	public void SetGraphVertexCount(int vertexCount) {
		this.numberOfVertices = vertexCount;
	}
	
	public void SetGraphAdjacencyList(LinkedList<Integer>[] adjList) {
		this.adjacencylist = adjList;
	}
	
	public void SetEdge(int sourceVertex, int endVertex) {
		this.adjacencylist[sourceVertex].add(endVertex);
	}
	
	public LinkedList<Integer> GetAdjacencyListOfVertex(int sourceVertex){
		return this.adjacencylist[sourceVertex];
	}
	
}
