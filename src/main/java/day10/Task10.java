package day10;

import day10.myTestBinaryTree.Node;

import javax.swing.tree.TreeNode;

public class Task10 {
    private static TreeNode root = new TreeNode(20);

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(14);
        TreeNode node2 = new TreeNode(23);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(16);
        TreeNode node5 = new TreeNode(22);
        TreeNode node6 = new TreeNode(27);
        TreeNode node7 = new TreeNode(5);
    }

    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode(int data) {
            this.data = data;
        }
        public void insertNode(int value) {
            TreeNode newNode = new TreeNode(value);
            newNode.setData(value);
            if (root == null) {
                return;
            } else {
                TreeNode currentNode = root;
                TreeNode parentNode;
                while (true) {
                    parentNode = currentNode;
                    if (value == currentNode.getData()) {
                        return;
                    } else if (value < currentNode.getData()) {
                        currentNode = currentNode.getLeft();
                        if (currentNode == null) {
                            parentNode.setLeft(newNode);
                            return;
                        }
                    } else {
                        currentNode = currentNode.getRight();
                        if (currentNode == null) {
                            parentNode.setRight(newNode);
                            return;
                        }
                    }
                }
            }
        }
    }
}
