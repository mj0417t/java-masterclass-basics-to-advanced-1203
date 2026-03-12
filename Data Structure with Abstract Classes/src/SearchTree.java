public class SearchTree implements NodeList{
    private ListItem root;
    public SearchTree(ListItem root){
        this.root=root;
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
        ListItem current=root;
        while (true){
            int compare = current.compareTo(item);
            if(compare<0){
                if(current.next()!=null){
                    current=current.next();
                }else{
                    current.setNext(item);
                    return  true;
                }
            }else if(compare>0){
                if(current.previous()!=null){
                    current=current.previous();
                }else{
                    current.setPrevious(item);
                    return true;
                }
            } else
                return  false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem current = root;
        ListItem parent =current;
        while (current!=null){
            int compare=current.compareTo(item);
            if(compare<0){
                parent=current;
                current=current.next();
            } else if (compare>0) {
                parent=current;
                current=current.previous();
            }
            else {
                performRemoval(current,parent);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if(item.next()==null){
            if(parent.next()==item){
                parent.setNext(item.previous());
            }else if(parent.previous()==item){
                parent.setPrevious(item.previous());
            }
            else
                root=item.previous();
        }
        else if(item.previous()==null){
            if(parent.next()==item){
                parent.setNext(item.next());
            }else if(parent.previous()==item){
                parent.setPrevious(item.next());
            }
            else
                root=item.next();
        }else{
            ListItem current=item.next();
            ListItem leftmostParent =item;
            while (current.previous()!=null){
                leftmostParent=current;
                current=current.previous();
            }
            item.setValue(current.getValue());

            if(leftmostParent==item){
                leftmostParent.setNext(current.next());
            }else{
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root!=null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}