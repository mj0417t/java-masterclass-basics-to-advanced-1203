public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object obj){
        value=obj;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object obj){
        value=obj;
    }
    abstract ListItem next();

    abstract ListItem setNext(ListItem n);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem n);

    abstract int compareTo(ListItem other);

}