package module03.asg01;

import az.edu.ada.modules.module03.asg01.factories.BudgetFactory;
import az.edu.ada.modules.module03.asg01.factories.DeviceFactory;
import az.edu.ada.modules.module03.asg01.factories.LuxuryFactory;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLight;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartLock;
import az.edu.ada.modules.module03.asg01.products.abstracts.SmartThermostat;
import az.edu.ada.modules.module03.asg01.products.concretes.SmartDevice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    @DisplayName("BudgetFactory creates BudgetLight")
    void budgetFactoryCreatesBudgetLight() {
        DeviceFactory factory = new BudgetFactory();
        SmartLight light = factory.createLight();

        assertNotNull(light);
        assertInstanceOf(SmartDevice.BudgetLight.class, light);
    }

    @Test
    @DisplayName("BudgetFactory creates BudgetLock")
    void budgetFactoryCreatesBudgetLock() {
        DeviceFactory factory = new BudgetFactory();
        SmartLock lock = factory.createLock();

        assertNotNull(lock);
        assertInstanceOf(SmartDevice.BudgetLock.class, lock);
    }

    @Test
    @DisplayName("BudgetFactory creates BudgetThermostat")
    void budgetFactoryCreatesBudgetThermostat() {
        DeviceFactory factory = new BudgetFactory();
        SmartThermostat thermostat = factory.createThermostat();

        assertNotNull(thermostat);
        assertInstanceOf(SmartDevice.BudgetThermostat.class, thermostat);
    }

    @Test
    @DisplayName("LuxuryFactory creates LuxuryLight")
    void luxuryFactoryCreatesLuxuryLight() {
        DeviceFactory factory = new LuxuryFactory();
        SmartLight light = factory.createLight();

        assertNotNull(light);
        assertInstanceOf(SmartDevice.LuxuryLight.class, light);
    }

    @Test
    @DisplayName("LuxuryFactory creates LuxuryLock")
    void luxuryFactoryCreatesLuxuryLock() {
        DeviceFactory factory = new LuxuryFactory();
        SmartLock lock = factory.createLock();

        assertNotNull(lock);
        assertInstanceOf(SmartDevice.LuxuryLock.class, lock);
    }

    @Test
    @DisplayName("LuxuryFactory creates LuxuryThermostat")
    void luxuryFactoryCreatesLuxuryThermostat() {
        DeviceFactory factory = new LuxuryFactory();
        SmartThermostat thermostat = factory.createThermostat();

        assertNotNull(thermostat);
        assertInstanceOf(SmartDevice.LuxuryThermostat.class, thermostat);
    }
}
