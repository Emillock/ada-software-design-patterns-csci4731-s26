package az.edu.ada.modules.module02.lecture07.gui;

import static az.edu.ada.modules.module02.lecture07.element.Element.*;

import az.edu.ada.modules.module02.lecture07.element.Element.Button;
import az.edu.ada.modules.module02.lecture07.enums.Color;

public interface GUIFactory {

    Button createButton(String text);

    Checkbox createCheckbox(String label);

    ProgressBar createProgressBar(int initialValue);


    class WinLightFactory implements GUIFactory {
        private static WinLightFactory instance;

        public static WinLightFactory getInstance() {
            if (instance == null) {
                instance = new WinLightFactory();
            }

            return instance;
        }

        public WinLightFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new WinButton(Color.WHITE, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new WinCheckbox(Color.GRAY, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new WinProgressBar(Color.BLACK, initialValue);
        }
    }

    class WinDarkFactory implements GUIFactory {
        private static WinDarkFactory instance;

        public static WinDarkFactory getInstance() {
            if (instance == null) {
                instance = new WinDarkFactory();
            }

            return instance;
        }

        public WinDarkFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new WinButton(Color.BLACK, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new WinCheckbox(Color.GRAY, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new WinProgressBar(Color.WHITE, initialValue);
        }
    }

    class MacLightFactory implements GUIFactory {
        private static MacLightFactory instance;

        public static MacLightFactory getInstance() {
            if (instance == null) {
                instance = new MacLightFactory();
            }

            return instance;
        }

        public MacLightFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new MacButton(Color.WHITE, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new MacCheckbox(Color.WHITE, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new MacProgressBar(Color.GRAY, initialValue);
        }
    }

    class MacDarkFactory implements GUIFactory {
        private static MacDarkFactory instance;

        public static MacDarkFactory getInstance() {
            if (instance == null) {
                instance = new MacDarkFactory();
            }

            return instance;
        }

        public MacDarkFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new MacButton(Color.BLACK, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new MacCheckbox(Color.BLACK, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new MacProgressBar(Color.GRAY, initialValue);
        }
    }

    class LnxLightFactory implements GUIFactory {
        private static LnxLightFactory instance;

        public static LnxLightFactory getInstance() {
            if (instance == null) {
                instance = new LnxLightFactory();
            }

            return instance;
        }

        public LnxLightFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new LnxButton(Color.GRAY, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new LnxCheckbox(Color.WHITE, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new LnxProgressBar(Color.BLACK, initialValue);
        }
    }

    class LnxDarkFactory implements GUIFactory {
        private static LnxDarkFactory instance;

        public static LnxDarkFactory getInstance() {
            if (instance == null) {
                instance = new LnxDarkFactory();
            }

            return instance;
        }

        public LnxDarkFactory() {
            if (instance != null) {
                throw new IllegalStateException("use getInstance() method for getting an instance");
            }
        }

        @Override
        public Button createButton(String text) {
            return new LnxButton(Color.GRAY, text);
        }

        @Override
        public Checkbox createCheckbox(String label) {
            return new LnxCheckbox(Color.BLACK, label);
        }

        @Override
        public ProgressBar createProgressBar(int initialValue) {
            return new LnxProgressBar(Color.WHITE, initialValue);
        }
    }
}
