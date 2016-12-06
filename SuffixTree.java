/**
 * Suffix Tree
 *
 */

public class SuffixTree {
	private Node root;
	
	public SuffixTree(String s){
		root = new Node(-1);
		build(s);
	}

	private void build(String s){
		Node n = root;
		for(int i = 0; i <= s.length() - 2; i++){
			for(int j = 0; j <= i; j++){
				// rule #2
				if(n.getEdge(s.charAt(i)) == null){
					
				}
			}
		}
	}
}
