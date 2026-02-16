package az.edu.ada.modules.module02.lecture07.element;

import az.edu.ada.modules.module02.lecture07.enums.Color;

public class Element {

    public interface Button {
        void paint();
    }

    public interface Checkbox {
        void paint();
    }

    public interface ProgressBar {
        void paint();
    }

    public static class BaseElement{
        public Color color;

        public BaseElement(Color color) {
            this.color = color;
        }
    }

    public static class WinButton extends BaseElement implements Button {
        public String text;

        public WinButton(Color color, String text) {
            super(color);
            this.text = text;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Windows Button with " + color + " color and text : " + text + ".");
        }
    }

    public static class WinCheckbox extends BaseElement implements Checkbox {
        public String label;

        public WinCheckbox(Color color, String label) {
            super(color);
            this.label = label;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Windows Checkbox with " + color + " color and label : " + label + ".");
        }
    }

    public static class WinProgressBar extends BaseElement implements ProgressBar {
        public int initialValue;

        public WinProgressBar(Color color, int initialValue) {
            super(color);
            this.initialValue = initialValue;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Windows Progress bar with " + color + " color.");
        }
    }

    public static class MacButton extends BaseElement implements Button {
        public String text;

        public MacButton(Color color, String text) {
            super(color);
            this.text = text;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a round Mac Button with " + color + " color and text : " + text + ".");
        }
    }

    public static class MacCheckbox extends BaseElement implements Checkbox {
        public String label;

        public MacCheckbox(Color color, String label) {
            super(color);
            this.label = label;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Mac Checkbox with " + color + " color and label : " + label + ".");
        }
    }

    public static class MacProgressBar extends BaseElement implements ProgressBar {
        public int initialValue;

        public MacProgressBar(Color color, int initialValue) {
            super(color);
            this.initialValue = initialValue;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a round Mac Progress bar with " + color + " color.");
        }
    }

    public static class LnxButton extends BaseElement implements Button {
        public String text;

        public LnxButton(Color color, String text) {
            super(color);
            this.text = text;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Linux Button with " + color + " color and text : " + text + ".");
        }
    }

    public static class LnxCheckbox extends BaseElement implements Checkbox {
        public String label;

        public LnxCheckbox(Color color, String label) {
            super(color);
            this.label = label;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Linux Checkbox with " + color + " color and label : " + label + ".");
        }
    }

    public static class LnxProgressBar extends BaseElement implements ProgressBar {
        public int initialValue;

        public LnxProgressBar(Color color, int initialValue) {
            super(color);
            this.initialValue = initialValue;
        }

        @Override
        public void paint() {
            System.out.println("Rendering a Linux Progress bar with " + color + " color.");
        }
    }
}
