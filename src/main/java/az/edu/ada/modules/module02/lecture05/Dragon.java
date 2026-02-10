package az.edu.ada.modules.module02.lecture05;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Cloneable {

    private final String name;
    private final String color;
    private final String texture;
    private final String sound;
    private List<String> treasureChest;

    public Dragon(String name, String color, List<String> treasureChest) throws InterruptedException {
        this.name = name;
        this.color = color;
        this.treasureChest = treasureChest;
        this.texture = loadTexture();
        this.sound = loadSound();
    }

    private String loadTexture() throws InterruptedException {
        System.out.println("Loading texture... I/O operation here");
        Thread.sleep(2000);
        return "Texture";
    }

    private String loadSound() throws InterruptedException {
        System.out.println("Loading sound... I/O operation here");
        Thread.sleep(3000);
        return "Sound";
    }

    public Dragon clone() throws CloneNotSupportedException {
        Dragon dragon = (Dragon) super.clone();
        dragon.treasureChest=new ArrayList<>(treasureChest);
        return dragon;
    }

    @Override
    public String toString() {
        return "Dragon{name='%s', color='%s', texture='%s', sound='%s', treasureChest='%s'}"
                .formatted(name, color, texture, sound, treasureChest);
    }

    public List<String> getTreasureChest() {
        return treasureChest;
    }
}