class Main{
    public static void main(String[] args){
        
        
        OSFactory winF = new OSFactoryWin();
        winF.getButton().click();
    }
}

abstract class OSFactory{
    
    public abstract Button getButton();
    
    public abstract Checkbox getCheckbox();
}

public class OSFactoryWin extends OSFactory{
    
    @Override
    public Button getButton(){
        return new ButtonWin();
    };
    
    @Override
    public Checkbox getCheckbox(){
        return new CheckboxMac();
    };
}

public class OSFactoryMac extends OSFactory{
    
    @Override
    public Button getButton(){
        return new ButtonMac();
    };
    
    @Override
    public Checkbox getCheckbox(){
        return new CheckboxMac();
    };
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




