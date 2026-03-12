enum BuildingType{
    BUSINESS, ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORT
}
public class Building implements Mappable{
    private String name;
    private BuildingType type;


    public Building(String name, BuildingType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLable() {
        return name+" ("+type+")";
    }
    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case SPORT -> Color.LAVENDER +" "+PointMarkers.STAR;
            case ENTERTAINMENT -> Color.GREEN +" "+PointMarkers.SQUARE;
            case GOVERNMENT -> Color.VIOLET+" "+PointMarkers.PUSH_PIN;
            case RESIDENTIAL -> Color.BLUE +" "+PointMarkers.TRIANGLE;
            default -> Color.BLACK+" "+PointMarkers.STAR;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ,"name": "%s, "usage": "%s"  """.formatted(name,type);
    }
}
