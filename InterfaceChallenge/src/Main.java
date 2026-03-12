import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall",BuildingType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", BuildingType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia",BuildingType.SPORT));

        mappables.add(new UtilityLine("College St",UtilityType.FIBER));
        mappables.add(new UtilityLine("Olympic BLVD", UtilityType.WATER));
        for(var m:mappables){
            Mappable.mapIt(m);
        }
    }
}