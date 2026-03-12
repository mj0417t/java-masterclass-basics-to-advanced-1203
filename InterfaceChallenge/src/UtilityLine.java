enum UtilityType{
    ELECTRICAL, FIBER, OPTIC, GAS, WATER
}

public class UtilityLine implements Mappable{
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLable() {
        return name+" ("+type+")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch(type){
            case GAS -> Color.VIOLET +" "+LineMarkers.DASHED;
            case ELECTRICAL -> Color.GREEN +" "+LineMarkers.DOTTED;
            case FIBER,OPTIC -> Color.LAVENDER +" "+LineMarkers.SOLID;
            case WATER -> Color.BLUE +" "+LineMarkers.SOLID;
            default -> Color.BLACK +" "+LineMarkers.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ,"name": "%s, "usage": "%s"  """.formatted(name,type);
    }
}
