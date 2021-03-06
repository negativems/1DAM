package ga.mmbh.cfgs.models;

public class Tree {

	private Node root;

	public Tree(Node root) {
		this.root = root;
	}
	
	public Node search(String value) {
		return root.searchNode(root, value);
	}
	
	public void preOrder() {
		System.out.println(root.getValue());
		this.root.preOrder(root);
	}
	
	public void postOrder() {
		this.root.postOrder(root);
		System.out.print(root.getValue());
	}
	
	public Node insertNode(Node node, String value) {
		return root.insertNode(root, node, value);
	}
	
	public String getPath(String value) {
		return search(value).getPath(root, value);
	}
}
