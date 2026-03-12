public class MyLinkedList implements NodeList{
    // write code here
    private ListItem root;
    public MyLinkedList(ListItem item){
        root=item;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(root==null){
            root=item;
            return true;
        }
        ListItem currentItem=root;
        while (currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                if(currentItem.next()!=null){
                    currentItem=currentItem.next();
                }else{
                    currentItem.setNext((item));
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison>0) {
                // Insert before currentItem
                item.setNext(currentItem);
                item.setPrevious(currentItem.previous());
                if(currentItem.previous()!=null)
                    currentItem.previous().setNext(item);
                else
                    root=item;
                currentItem.setPrevious(item);
                return true;

            }else
                return false;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(root!=null){
            ListItem currentItem=root;
            while (currentItem!=null){
                int compare = currentItem.compareTo(item);
                if(compare==0){
                    if(currentItem==root)
                        root=currentItem.next();
                    else {
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next()!=null){
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                     return true;
                }else if (compare<0)
                    currentItem=currentItem.next();
                else
                    return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null)
            System.out.println("The list is empty");
        else {
            ListItem current = root;
            while (current!=null){
                System.out.println(current.getValue());
                current=current.next();
            }
        }

    }
}