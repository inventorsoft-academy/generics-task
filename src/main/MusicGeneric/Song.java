package main.MusicGeneric;

public class Song<T> {
    private T sound;

    public T getSound() {
        return sound;
    }

    public void setSound(T sound) {
        this.sound = sound;
    }
}
