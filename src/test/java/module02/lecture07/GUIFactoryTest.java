package module02.lecture07;

import az.edu.ada.modules.module02.lecture07.enums.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static az.edu.ada.modules.module02.lecture07.element.Element.*;
import static az.edu.ada.modules.module02.lecture07.gui.GUIFactory.*;


public class GUIFactoryTest {


    @Test
    @DisplayName("WinDarkFactory should create an instance of WinButton with Black color on WinDarkFactory.createButton()")
    void testWinDarkFactoryButton() {
        WinDarkFactory winDarkFactory = new WinDarkFactory();
        Button button = winDarkFactory.createButton("Click Me");
        Class<WinButton> expectedClass = WinButton.class;

        assertEquals(expectedClass, button.getClass());
        assertEquals(Color.BLACK, ((WinButton) button).color);
    }
}
