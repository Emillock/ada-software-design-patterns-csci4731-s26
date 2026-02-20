package module03.asg01;

import az.edu.ada.modules.module03.asg01.products.abstracts.SmartThermostat;
import az.edu.ada.modules.module03.asg01.products.concretes.SmartDevice;
import az.edu.ada.modules.module03.asg01.products.legacy.GlorbThermostat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AdapterTest {
    @Test
    @DisplayName("GlorbAdapter implements SmartThermostat")
    void adapterImplementsSmartThermostat() {
        SmartDevice.GlorbAdapter adapter = new SmartDevice.GlorbAdapter(new GlorbThermostat());
        assertInstanceOf(SmartThermostat.class, adapter);
    }

    @Test
    @DisplayName("set 25C")
    void setTwentyFiveCelsius7() {
        SmartDevice.GlorbAdapter adapter = new SmartDevice.GlorbAdapter(new GlorbThermostat());
        adapter.setTemperature(25.0);
        assertEquals(77.0, adapter.getTemperature("f"));
        assertEquals(25.0, adapter.getTemperature("c"));
    }

    @Test
    @DisplayName("set 0C")
    void setZeroCelsius() {
        SmartDevice.GlorbAdapter adapter = new SmartDevice.GlorbAdapter(new GlorbThermostat());
        adapter.setTemperature(0.0);
        assertEquals(32.0, adapter.getTemperature("f"));
        assertEquals(0.0, adapter.getTemperature("c"));
    }

    @Test
    @DisplayName("set 100C")
    void setHundredCelsius() {
        SmartDevice.GlorbAdapter adapter = new SmartDevice.GlorbAdapter(new GlorbThermostat());
        adapter.setTemperature(100.0);
        assertEquals(212.0, adapter.getTemperature("f"));
        assertEquals(100.0, adapter.getTemperature("c"));
    }
}
