package az.edu.ada.modules.module02.lecture05;

public class Truck implements Transport{
    @Override
    public void deliver(String[] products) {
        System.out.println("delivered by truck: " + products[0]);
    }
}
