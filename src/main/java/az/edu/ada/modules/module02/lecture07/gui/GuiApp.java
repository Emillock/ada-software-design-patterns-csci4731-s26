package az.edu.ada.modules.module02.lecture07.gui;

import az.edu.ada.modules.module02.lecture07.utils.PropertyReader;
import az.edu.ada.modules.module02.lecture07.window.Window;
import az.edu.ada.modules.module02.lecture07.window.WindowBuilder;
import az.edu.ada.modules.module02.lecture07.enums.Theme;
import az.edu.ada.modules.module02.lecture07.gui.GUIFactory.*;

import java.io.IOException;

public class GuiApp {

    private static Window configureApplication() throws IOException {
        Window app;
        GUIFactory factory;

        PropertyReader.readProperty();
        Theme theme = PropertyReader.getTheme();
        String osName = PropertyReader.getOs();

        System.out.println("OS: " + osName);
        System.out.println("Theme: " + theme);

        if (osName.contains("mac")) {
            factory = theme == Theme.DARK ? MacDarkFactory.getInstance() : MacLightFactory.getInstance();
        } else if (osName.contains("win")) {
            factory = theme == Theme.DARK ? WinDarkFactory.getInstance() : WinLightFactory.getInstance();
        } else if (osName.contains("lnx")) {
            factory = theme == Theme.DARK ? LnxDarkFactory.getInstance() : LnxLightFactory.getInstance();
        } else {
            throw new RuntimeException("Unrecognized OS: " + osName);
        }

        app = new WindowBuilder(factory)
                .addTitle("Cool Title")
                .addButton("Click Me")
                .addCheckbox("Is Checked")
                .addProgressBar(0)
                .build();

        return app;
    }

    public static void main(String[] args) throws IOException {
        Window app = configureApplication();
        app.paint();
    }
}
