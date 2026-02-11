package az.edu.ada.modules.module02.lecture05;

import java.util.ArrayList;
import java.util.List;

public class FastCargo {
    ArrayList<Transport> transports;

    public FastCargo(Transport... transports) {
        this.transports= new ArrayList<>(List.of(transports));
    }

    public void deliver(String[] args) {
        for (int i = 0; i<args.length; i++) {
            transports.get(i % transports.size()).deliver(new String[]{args[i]});
        }
    }

}
