public class MotherBoard extends Monitor{
    private int ramSlots, cardSlots;
    private String bios;


    public void loadProgram(String programName){
        System.out.println("Program "+programName+ "is loading ...");
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

}
