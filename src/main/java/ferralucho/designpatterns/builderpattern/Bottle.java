package ferralucho.designpatterns.builderpattern;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
