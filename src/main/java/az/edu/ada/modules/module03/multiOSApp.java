class Main{
    public static void main(String[] args){
        Button buttonWin = new ButtonWin();
        buttonWin.click();
        Button buttonMac = new ButtonMac();
        buttonMac.click();
        
        Checkbox checkboxMac = new CheckboxMac();
        checkboxMac.check();
        Checkbox checkboxWin = new CheckboxWin();
        checkboxWin.check();
    }
}

abstract class Button{
    public abstract void click();
}

class ButtonWin extends Button{
    @Override
    public void click(){
        System.out.println("Clicked Windows Button");
    }
}

class ButtonMac extends Button{
    @Override
    public void click(){
        System.out.println("Clicked Mac Button");
    }
}

abstract class Checkbox{
    public abstract void check();
}

class CheckboxWin extends Checkbox{
    @Override
    public void check(){
        System.out.println("Checked Win Checkbox");
    }
}

class CheckboxMac extends Checkbox{
    @Override
    public void check(){
        System.out.println("Checked Mac Checkbox");
    }
}




