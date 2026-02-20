package az.edu.ada.modules.module03.asg01.factories;

import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLight;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLock;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartThermostat;
import az.edu.ada.modules.module03.asg01.products.concretes.SmartDevice;

public class BudgetFactory implements DeviceFactory {
    @Override
    public SmartLight createLight() {
        return new SmartDevice.BudgetLight();
    }

    @Override
    public SmartLock createLock() {
        return new SmartDevice.BudgetLock();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new SmartDevice.BudgetThermostat();
    }
}
