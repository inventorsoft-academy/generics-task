package main.MusicGeneric;

public class Main {
    public static void main(String[] args) {

        final Song<Guitar> guitarSong = new Song<Guitar>();
        final Guitar guitar = guitarSong.getSound();

        final Song<Drums> drumsSong = new Song<Drums>();
        final Drums drums = drumsSong.getSound();

        final Song<Piano> pianoSong = new Song<Piano>();
        final Piano piano = pianoSong.getSound();

    }
}
