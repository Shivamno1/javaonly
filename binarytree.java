package binary;
class Node{
	char key;
	Node left,right;
	Node(char key){
		this.key=key;
	}
}

class TreeTraveral{
Node root;
public void preordertraversal(Node n) {
	if(n!=null) {
		System.out.print(n.key);
		preordertraversal(n.left);
		preordertraversal(n.right);
	}
}
}

public class binarytree {
public static void main(String[] args) {
	TreeTraveral t1=new TreeTraveral();
	t1.root=new Node('a');
	t1.root.left=new Node('b');
	t1.root.right=new Node('c');
	t1.root.left.left=new Node('d');
	t1.root.left.right=new Node('e');
	t1.preordertraversal(t1.root);
}

}
