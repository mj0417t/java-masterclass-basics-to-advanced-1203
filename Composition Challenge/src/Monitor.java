class Monitor extends Product{
    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    private int size;
    private String resolution;

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d using color %s",x,y,color));

    }
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}