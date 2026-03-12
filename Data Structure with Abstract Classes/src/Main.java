public class Main {

    public static void main(String[] args) {

        // ===== LINKED LIST TEST =====
        System.out.println("---- LINKED LIST TEST ----");

        NodeList linkedList = new MyLinkedList(null);

        String data = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] dataArray = data.split(" ");

        for (String s : dataArray) {
            linkedList.addItem(new Node(s));
        }

        linkedList.traverse(linkedList.getRoot());

        System.out.println("\nRemoving Canberra");
        linkedList.removeItem(new Node("Canberra"));
        linkedList.traverse(linkedList.getRoot());


        // ===== BINARY SEARCH TREE TEST =====
        System.out.println("\n---- SEARCH TREE TEST ----");

        NodeList searchTree = new SearchTree(null);

        for (String s : dataArray) {
            searchTree.addItem(new Node(s));
        }

        searchTree.traverse(searchTree.getRoot());

        System.out.println("\nRemoving Brisbane");
        searchTree.removeItem(new Node("Brisbane"));
        searchTree.traverse(searchTree.getRoot());
    }
}
