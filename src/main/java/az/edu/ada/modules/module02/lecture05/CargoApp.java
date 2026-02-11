package az.edu.ada.modules.module02.lecture05;

public class CargoApp {
    public static void main(String[] args) {
        FastCargo fastCargo = new FastCargo(new Plane(), new Truck(), new Truck());
        fastCargo.deliver(new String[]{"bananas", "apples", "mangoes", "pizza"});
    }
}
