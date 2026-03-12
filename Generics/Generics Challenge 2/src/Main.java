//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("Yellow Stone","44.4882,-110.5916"),
                new Park("Grand Canyon","36.0636,-112.1079"),
                new Park("Rosemite","37.8855,-119.5360")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();


        var majorUSRivers = new River[]{
                new River("Mississippi","47.2160,-952348","35.1556,-90.0659",
                        "29.1556,-89.2495"),
                new River("Missouri","45.4534,59.52453","38.34445, -90.14324")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colarado","47.2160,-952348","35.1556,-90.0659",
                        "29.1556,-89.2495"),
                new River("Delaware","45.4534,59.52453","38.34445, -90.14324")
        );
        riverLayer.renderLayer();
    }
}