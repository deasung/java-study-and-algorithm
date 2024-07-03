package 백준.트리.문제_1991;

import java.util.Scanner;

class Node {

  char data;
  Node left;
  Node right;

  Node(char data) {
    this.data = data;
  }
}

class BinaryTree {

  Node root;

  void addNode(char data, char leftData, char rightData) {
    if (root == null) {
      root = new Node(data);
      if (leftData != '.') {
        root.left = new Node(leftData);
      }
      if (rightData != '.') {
        root.right = new Node(rightData);
      }
    } else {
      searchAndAdd(root, data, leftData, rightData);
    }
  }

  void searchAndAdd(Node root, char data, char leftData, char rightData) {
    if (root == null) {
      return;
    }
    if (root.data == data) {
      if (leftData != '.') {
        root.left = new Node(leftData);
      }
      if (rightData != '.') {
        root.right = new Node(rightData);
      }
    } else {
      searchAndAdd(root.left, data, leftData, rightData);
      searchAndAdd(root.right, data, leftData, rightData);
    }
  }

  void preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data);
    preorder(node.left);
    preorder(node.right);
  }

  void inorder(Node node) {
    if (node == null) {
      return;
    }
    inorder(node.left);
    System.out.print(node.data);
    inorder(node.right);
  }

  void postorder(Node node) {
    if (node == null) {
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data);
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BinaryTree tree = new BinaryTree();

    for (int i = 0; i < n; i++) {
      char data = sc.next().charAt(0);
      char leftData = sc.next().charAt(0);
      char rightData = sc.next().charAt(0);
      tree.addNode(data, leftData, rightData);
    }

    //전위
    tree.preorder(tree.root);
    System.out.println();

    //중위
    tree.inorder(tree.root);
    System.out.println();

    //후위
    tree.postorder(tree.root);
  }
}