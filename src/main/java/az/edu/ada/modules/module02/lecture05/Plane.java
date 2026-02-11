package az.edu.ada.modules.module02.lecture05;

public class Plane implements Transport{
    @Override
    public void deliver(String[] products) {
        System.out.println("delivered by plane: " + products[0]);
    }
}
