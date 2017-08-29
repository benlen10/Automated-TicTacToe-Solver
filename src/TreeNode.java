public class TreeNode{
	public int score = 0;
	public List<TreeNode> children;
	public char[][] state;
	public TreeNode parent;

	TreeNode(){
		children =  new ArrayList<TreeNode>();		
	}

	TreeNode(int score, char[][] state, TreeNode parent){
		this.score = score;
		this.state = state;
		children =  new ArrayList<TreeNode>();		
		this.parent = parent;
	}

	public boolean isLeaf(){
		return children.isEmpty();
	}
}