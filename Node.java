import java.util.HashMap;
/**
 * Clase para guardar un nodo
 *
 */
public class Node {
	private HashMap<Character, Edge> edges;
	private Node suffixLink;
	private int label;
	
	public Node(int label){
		edges = new HashMap<>();
		suffixLink = null;
		this.label = label;
	}
	
	public void setSuffixLink(Node suffixLink){
		this.suffixLink = suffixLink;
	}
	
	public Node getSuffixLink(){
		return suffixLink;
	}
	
	public Edge getEdge(char c){
		return edges.get(c);
	}
	
	public void addEdge(char c, Edge e){
		edges.put(c, e);
	}
	
	public int getLabel(){
		return label;
	}
	
	public void setLabel(int label){
		this.label = label;
	}
}
