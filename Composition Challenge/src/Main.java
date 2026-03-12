//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerCase thecase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                25, "2540 x 1440");

        MotherBoard themotherBoard = new MotherBoard("BJ-200",
                "Asus", 4, 5, "v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208","Dell",
                theMonitor,themotherBoard, thecase);

//        personalComputer.getMonitor().drawPixelAt(10,10,"yellow");
//        personalComputer.getMotherBoard().loadProgram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUp();
    }
}
