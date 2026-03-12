import java.util.Arrays;

public interface Mappable {
    void render();
    static double[] stringToLatLon(String loc){
        String[] splits = loc.split(",");
        double lat=Double.valueOf(splits[0]);
        double lon=Double.valueOf(splits[1]);
        return new double[]{lat,lon};
    }
}

abstract class Point implements Mappable{
    private double[] location;

    public Point(String location){
        this.location=Mappable.stringToLatLon(location);
    }
    private String location(){
        return Arrays.toString(location);
    }
    public void render(){
        System.out.println("Render "+this+ "as point ("+location() +")");
    }
}

abstract class Line implements Mappable{
    private double[][] locations;

    public Line(String... locations){
        this.locations=new double[locations.length][];
        int index=0;
        for (var l: locations){
            this.locations[index++]=Mappable.stringToLatLon(l);
        }
    }

    private String location(){
        return Arrays.deepToString(locations);
    }
    public void render(){
        System.out.println("Render "+this+ "as Line ("+location() +")");
    }
}