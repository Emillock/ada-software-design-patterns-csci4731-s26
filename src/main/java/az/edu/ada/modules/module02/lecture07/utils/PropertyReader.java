package az.edu.ada.modules.module02.lecture07.utils;

import az.edu.ada.modules.module02.lecture07.enums.Theme;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private static String os;
    private static Theme theme;
    private static InputStream inputStream;

    public static void readProperty() throws IOException {
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";
            inputStream = PropertyReader.class.getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            os = prop.getProperty("os").toLowerCase();
            theme = Theme.valueOf(prop.getProperty("theme").toUpperCase());

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            assert inputStream != null;
            inputStream.close();
        }

    }

    public static String getOs() {
        return os;
    }

    public static Theme getTheme() {
        return theme;
    }
}
