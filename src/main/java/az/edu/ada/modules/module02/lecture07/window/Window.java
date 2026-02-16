package az.edu.ada.modules.module02.lecture07.window;

import az.edu.ada.modules.module02.lecture07.element.Element.Button;
import az.edu.ada.modules.module02.lecture07.element.Element.Checkbox;
import az.edu.ada.modules.module02.lecture07.element.Element.ProgressBar;

import java.util.ArrayList;

public class Window {

    private ArrayList<String> titles;
    private ArrayList<Button> buttons;
    private ArrayList<Checkbox> checkboxes;
    private ArrayList<ProgressBar> progressBars;

    public Window(ArrayList<String> titles, ArrayList<Button> buttons, ArrayList<Checkbox> checkboxes, ArrayList<ProgressBar> progressBars) {
        this.titles = new ArrayList<>(titles);
        this.buttons = new ArrayList<>(buttons);
        this.checkboxes = new ArrayList<>(checkboxes);
        this.progressBars = new ArrayList<>(progressBars);
    }

    public void paint() {
        for(int i = 0; i < titles.size(); i++) {
            System.out.println("Window Title " + i + ": " + titles.get(i));
        }

        for(Button button : buttons) {
            button.paint();
        }

        for(Checkbox checkbox : checkboxes) {
            checkbox.paint();
        }

        for(ProgressBar progressBar : progressBars) {
            progressBar.paint();
        }
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public ArrayList<Button> getButtons() {
        return buttons;
    }

    public ArrayList<Checkbox> getCheckboxes() {
        return checkboxes;
    }

    public ArrayList<ProgressBar> getProgressBars() {
        return progressBars;
    }
}
