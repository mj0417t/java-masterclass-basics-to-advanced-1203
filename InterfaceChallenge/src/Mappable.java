enum Geometry{
    LINE, POINT, POLYGON
}
enum Color {
    BLACK, BLUE, GREEN, VIOLET, LAVENDER
}

enum LineMarkers{
    DASHED, DOTTED, SOLID
}

enum PointMarkers{
    CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE
}


public interface Mappable {
    String JSON_PROPERTY="\"properties\":{%s}";


    String getLable();
    Geometry getShape();
    String getMarker();

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

    default String toJSON(){
        return """
                "type":"%s", "label": "%s", "marker": "%s"  """.formatted(getShape(),getLable(),getMarker());
    }

}
