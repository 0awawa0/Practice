
/*
Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}

Populate each `next` pointer to point to its next right node. If there is no next right node, the `next` pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.
*/

fun connect(root: Node?): Node? {
    var lvlHead: Node? = null
    var prevNode: Node? = null
    var currNode: Node? = root
        
    while (currNode != null) {
            
        while (currNode != null) {
                
            if (currNode.left != null) {
                if (prevNode != null) prevNode.next = currNode.left
                else lvlHead = currNode.left
                prevNode = currNode.left
            }
                
            if (currNode.right != null) {
                if (prevNode != null) prevNode.next = currNode.right
                else lvlHead = currNode.right
                prevNode = currNode.right
            }
                
            currNode = currNode.next
        }
            
        currNode = lvlHead
        lvlHead = null
        prevNode = null
    }
        
    return root
}