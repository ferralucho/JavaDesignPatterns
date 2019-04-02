package ferralucho.designpatterns.abstractfactorypattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside square::draw() method.");
    }
}