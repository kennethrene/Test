package dj.ekogui.test.ejercicio3;

public class BinarySearchTreeValidator {
	private boolean checkBST(Node node) {
		boolean resp = true;

		if (node.hasChilds()) {
			if (node.hasLeftChild())
				if (node.isBinaryTree())
					checkBST(node.left);
				else
					return false;

			if (node.hasRightChild())
				if (node.isBinaryTree())
					checkBST(node.right);
				else
					return false;
		}

		return resp;
	}

	public static void main(String[] args) {
		BinarySearchTreeValidator obj = new BinarySearchTreeValidator();

		Node n1 = new Node(3);
		Node n2 = new Node(5);
		Node n3 = new Node(2);
		Node n4 = new Node(1);
		Node n5 = new Node(4);
		Node n6 = new Node(6);

		n1.addLeftNode(n3);
		n1.addRightNode(n2);

		n2.addLeftNode(n5);
		n2.addRightNode(n4);

		n3.addRightNode(n6);

		if (obj.checkBST(n1))
			System.out.println("Si");
		else
			System.out.println("No");
	}
}