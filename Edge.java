/**
 * Clase para guardar una arista.
 *
 */
public class Edge {
	private String label;
	private Node next;
	
	public Edge(String label, Node next){
		this.label = label;
		this.next = next;
	}
	
	public String getLabel(){
		return label;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	/**
	 * Índices para la arista
	 * @author mrg
	 *
	 */
	private class Tag {
		private int first;
		private int last;
		
		public Tag(int first, int last){
			this.first = first;
			this.last = last;
		}
		
		public int getFirst(){
			return first;
		}
		
		public int getLast(){
			return last;
		}
		
		public void setFirst(int first){
			this.first = first;
		}
		
		public void setLast(int last){
			this.last = last;
		}
	}
}
