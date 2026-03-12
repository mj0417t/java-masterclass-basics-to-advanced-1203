public class Node extends ListItem{
    // write code here
    public Node(Object obj){
        super(obj);
    }
    ListItem next(){
        return this.rightLink;
    }
    ListItem setNext(ListItem item){
        this.rightLink=item;
        return this.rightLink;
    }
    ListItem previous(){
        return this.leftLink;
    }
    ListItem setPrevious(ListItem item){
        this.leftLink=item;
        return this.leftLink;
    }
    int compareTo(ListItem item){
        if(item!=null){
            return ((Comparable) this.value).compareTo(item.getValue());
        }
        return -1;
    }
}