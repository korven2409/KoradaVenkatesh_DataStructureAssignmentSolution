package com.greatLearning.Question2;
import java.util.*;
class Node
{
    int val;
    Node left, right;
    Node(int item)
    {
        val = item;
        left = right = null;
    }
}
public class Driver {
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
    static void BstToSkewed(Node root,int order)
    {
        if(root == null)
        {
            return;
        }
        if(order > 0)
        {
        	BstToSkewed(root.right, order);
        }
        else
        {
        	BstToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        if (order > 0)
        {
        	BstToSkewed(leftNode, order);
        }
        else
        {
        	BstToSkewed(rightNode, order);
        }
    }
    static void traverse(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverse(root.right);       
    }
    public static void main (String[] args)
    {
        Driver tree = new Driver();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);
        int order = 0;
        BstToSkewed(node, order);
        traverse(headNode);
    }
}
