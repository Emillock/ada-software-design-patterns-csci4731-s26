package az.edu.ada.modules.module03.asg01.factories;

import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLight;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLock;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartThermostat;

public interface DeviceFactory {
    SmartLight createLight();

    SmartLock createLock();

    SmartThermostat createThermostat();
}
