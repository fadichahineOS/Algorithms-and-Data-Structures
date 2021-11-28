public class Node {
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value <= data){
            if(left == null){
                left = new Node(value);
            } else {
                left.insert(value);
            }
        }
        else{
            if(right == null){
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean find(int value){
        if (value == data){
            return true;
        } else if (value < data){
            if(left == null){
                return false;
            } else {
                return left.find(value);
            }
        } else{
            if(right == null){
                return false;
            } else {
                return right.find(value);
            }
        }
    }

    public void traverseInOrder(){
        if(left != null){
            left.traverseInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.traverseInOrder();
        }
        System.out.println();
    }


    public static void main(String[] args){
        Node node = new Node(10);

        node.insert(5);

        node.insert(13);
        node.insert(4);
        node.insert(8);

        System.out.println(node.find(14));
        node.traverseInOrder();
    }


}
