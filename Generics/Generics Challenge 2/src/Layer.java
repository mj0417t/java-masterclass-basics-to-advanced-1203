import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(Arrays.asList(layerElements));
    }

    void addElement(T t){}
    public void addElements(T... elements){
        layerElements.addAll(List.of(elements));
    }
    void renderLayer(){
        for(T element: layerElements){
            element.render();
        }
    }
}
