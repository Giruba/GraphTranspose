import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Transpose of a Graph");
		System.out.println("--------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of vertices in the graph");
			int numberOfVertices = scanner.nextInt();
			Graph graph = new Graph(numberOfVertices);
			for(int index = 0; index < numberOfVertices; index++) {
				System.out.println("Enter the number of ajacent vertices for this vertex");
				int adjVertexCount = scanner.nextInt();
				for(int adjVertexIndex = 0; adjVertexIndex < adjVertexCount; adjVertexIndex++) {
					System.out.println("Enter the adjacent vertex");
					graph.SetEdge(index,scanner.nextInt());
				}
			}
			System.out.println("----- The Constructed Graph is -----");
			UtilityClass.PrintGraph(graph);
			System.out.println("------- The Transpose of the constructed graph is -------");
			graph = UtilityClass.GetTranspose(graph);
			UtilityClass.PrintGraph(graph);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
