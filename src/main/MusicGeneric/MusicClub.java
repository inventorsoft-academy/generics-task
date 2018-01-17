package main.MusicGeneric;

public class MusicClub {

    public Song<Guitar> orderGuitarSong() {
    final Song<Guitar> guitarSong = new Song<Guitar>();
    guitarSong.setSound(new Guitar());
    return guitarSong;
    }

    public Song<Drums> orderDrumsSong() {
        final Song<Drums> drumsSong = new Song<Drums>();
        drumsSong.setSound(new Drums());
        return drumsSong;
    }

    public Song<Piano> orderPianoSong() {
        final Song<Piano> pianoSong = new Song<Piano>();
        pianoSong.setSound(new Piano());
        return pianoSong;
    }


}
