public class Node {
    String type;
    String name;
    Node node;
    Node child;   //孩子
    Node father;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getChild() {
        return child;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public Node getNode() {
        return node;
    }
    public Node getFather(){
        return this.father;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    public void setChild(Node child) {
        this.child = child;
    }
}
