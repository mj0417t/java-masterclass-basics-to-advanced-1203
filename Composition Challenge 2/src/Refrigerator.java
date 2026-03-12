public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if(hasWorkToDo)
            System.out.println("ordering food...");
        hasWorkToDo=false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }
}
