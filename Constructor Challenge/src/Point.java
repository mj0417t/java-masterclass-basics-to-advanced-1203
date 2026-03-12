public class Point {
    // write code here
    private int x, y;

    public Point(){}
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt((double)(x*x+y*y));
    }

    public double distance(Point p){
        int xA=p.getX();
        int yA=p.getY();
        return Math.sqrt((double)((x-xA)*(x-xA)+(y-yA)*(y-yA)));
    }

    public double distance(int x, int y){
        return Math.sqrt((double)((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)));
    }


}
