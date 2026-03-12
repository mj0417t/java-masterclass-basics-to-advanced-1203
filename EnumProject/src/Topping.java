public enum Topping {
    mustard,
    pickle,
    bacon,
    cheddar,
    tomato;

    public double getPrice(){
        return switch (this){
            case bacon -> 1.5;
            case cheddar -> 1.0;
            default -> 0.5;
        };
    }
}

