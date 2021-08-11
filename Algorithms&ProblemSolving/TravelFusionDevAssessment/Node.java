public class Node {
    private Node leftChild, rightChild;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        if (this.equals(null)){
            return -1;
        }
        int maxLeft = 0;
        int maxRight = 0;
        if (this.leftChild != null){
            maxLeft = this.getLeftChild().height();
        }
        if (this.rightChild != null){
            maxRight = this.getRightChild().height();
        }
        if (maxLeft > maxRight){
            return maxLeft + 1;
        }else {
            return maxRight + 1;
        }

    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}
