package dj.ekogui.test.ejercicio3;

import co.com.grupoImperio.general.dao.Node;

public class Node {
	int data;
	Node left;
	Node right;

	public Node(int value) {
		this.data = value;
	}

	public void addLeftNode(Node left) {
		this.left = left;
	}

	public void addRightNode(Node right) {
		this.right = right;
	}

	public boolean hasChilds() {
		return hasLeftChild() || hasRightChild();
	}

	public boolean hasLeftChild() {
		if (left != null)
			return true;
		else
			return false;
	}

	public boolean hasRightChild() {
		if (right != null)
			return true;
		else
			return false;
	}

	public boolean isBinaryTree() {
		boolean resp = true;

		if (left != null && left.data > data)
			resp = false;

		if (right != null && right.data < data)
			resp = false;

		return resp;
	}

}