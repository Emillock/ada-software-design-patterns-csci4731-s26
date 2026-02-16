package module02.lecture07;

import az.edu.ada.modules.module02.lecture07.gui.GUIFactory;
import az.edu.ada.modules.module02.lecture07.window.Window;
import az.edu.ada.modules.module02.lecture07.window.WindowBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowBuilderTest {

    @Test
    void testOneInstanceOfEachComponentUsingWinDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.WinDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testOneInstanceOfEachComponentUsingWinLightFactory() {
        GUIFactory guiFactory = new GUIFactory.WinLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testOneInstanceOfEachComponentUsingMacDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.MacDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testOneInstanceOfEachComponentUsingMacLightFactory() {
        GUIFactory guiFactory = new GUIFactory.MacLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testOneInstanceOfEachComponentUsingLnxDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.LnxDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testOneInstanceOfEachComponentUsingLnxLightFactory() {
        GUIFactory guiFactory = new GUIFactory.LnxLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(1, window.getTitles().size());
        assertEquals(1, window.getButtons().size());
        assertEquals(1, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingWinDarkFactory2() {
        GUIFactory guiFactory = new GUIFactory.WinDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingWinLightFactory2() {
        GUIFactory guiFactory = new GUIFactory.WinLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingMacDarkFactory2() {
        GUIFactory guiFactory = new GUIFactory.MacDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingMacLightFactory2() {
        GUIFactory guiFactory = new GUIFactory.MacLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingLnxDarkFactory2() {
        GUIFactory guiFactory = new GUIFactory.LnxDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testInstancesOfEachComponentUsingLnxLightFactory2() {
        GUIFactory guiFactory = new GUIFactory.LnxLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .addTitle("Title")
                .addTitle("Title")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addButton("Button")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addCheckbox("Checkbox")
                .addProgressBar(0)
                .build();

        assertEquals(2, window.getTitles().size());
        assertEquals(5, window.getButtons().size());
        assertEquals(3, window.getCheckboxes().size());
        assertEquals(1, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingWinDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.WinDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingWinLightFactory() {
        GUIFactory guiFactory = new GUIFactory.WinLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingMacDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.MacDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingMacLightFactory() {
        GUIFactory guiFactory = new GUIFactory.MacLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingLnxDarkFactory() {
        GUIFactory guiFactory = new GUIFactory.LnxDarkFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }

    @Test
    void testEmptyComponentsUsingLnxLightFactory() {
        GUIFactory guiFactory = new GUIFactory.LnxLightFactory();
        Window window = new WindowBuilder(guiFactory)
                .build();

        assertEquals(0, window.getTitles().size());
        assertEquals(0, window.getButtons().size());
        assertEquals(0, window.getCheckboxes().size());
        assertEquals(0, window.getProgressBars().size());
    }
}
