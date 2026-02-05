class GameObject{
    protected String texture;
    protected String model;
    protected String coords;
    protected String scale;
}

class memoryManager{
    public static String loadFile(String path){
        System.out.println("loaded "+path);
        // Thread.sleep(500);
        return path;
    }
}

class Dragon extends GameObject{
    String texturePath;
    String modelPath;
    String soundPath;
    String sound;
    
    public Dragon(String texturePath, String modelPath, String soundPath, String coords, String scale){
        this.texturePath=texturePath;
        this.modelPath=modelPath;
        this.soundPath=soundPath;
        this.coords=coords;
        this.scale=scale;
    }
    
    public void loadFromDisc(){
        this.texture = memoryManager.loadFile(texturePath);
        this.model = memoryManager.loadFile(modelPath);
        this.sound = memoryManager.loadFile(soundPath);
    }
    
    public String getTexture(){
        return this.texture;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public String getSound(){
        return this.sound;
    }
}

class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("texPath", "modelPath", "soundPath", "0,0,0", "1,1,1");
        dragon.loadFromDisc();
        System.out.println(dragon.getTexture());
        System.out.println(dragon.getModel());
        System.out.println(dragon.getSound());
    }
}
