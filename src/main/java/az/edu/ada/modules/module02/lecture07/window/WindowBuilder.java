package az.edu.ada.modules.module02.lecture07.window;

import az.edu.ada.modules.module02.lecture07.element.Element.Button;
import az.edu.ada.modules.module02.lecture07.element.Element.Checkbox;
import az.edu.ada.modules.module02.lecture07.element.Element.ProgressBar;
import az.edu.ada.modules.module02.lecture07.gui.GUIFactory;

import java.util.ArrayList;

public class WindowBuilder {
    GUIFactory guiFactory;
    private ArrayList<String> titles;
    private ArrayList<Button> buttons;
    private ArrayList<Checkbox> checkboxes;
    private ArrayList<ProgressBar> progressBars;

    public WindowBuilder(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.titles = new ArrayList<>();
        this.buttons = new ArrayList<>();
        this.checkboxes = new ArrayList<>();
        this.progressBars = new ArrayList<>();
    }

    public WindowBuilder addTitle(String title) {
        titles.add(guiFactory.getClass().getSimpleName().substring(0,3) + " Application Title: " + title);

        return this;
    }

    public WindowBuilder addButton(String text) {
        buttons.add(guiFactory.createButton(text));

        return this;
    }

    public WindowBuilder addCheckbox(String label) {
        checkboxes.add(guiFactory.createCheckbox(label));

        return this;
    }

    public WindowBuilder addProgressBar(int initialValue) {
        progressBars.add(guiFactory.createProgressBar(initialValue));

        return this;
    }

    public Window build() {
        return new Window(titles, buttons, checkboxes, progressBars);
    }
}
