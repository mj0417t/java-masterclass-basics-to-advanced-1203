public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if(hasWorkToDo)
            System.out.println("brewing coffee...");
        hasWorkToDo=false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }
}
