package ferralucho.designpatterns.builderpattern;

public interface Item {
    String name();
    Packing packing();
    float price();
}