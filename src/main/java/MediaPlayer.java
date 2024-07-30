import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Playable> playlist;

    public MediaPlayer() {
        this.playlist = new ArrayList<>();
    }

    // Метод для добавления одного трека или видео
    public void addToPlaylist(Playable playable) {
        playlist.add(playable);
    }

    // Метод для добавления нескольких треков или видео
    public void addToPlaylist(Playable... playables) {
        for (Playable playable : playables) {
            playlist.add(playable);
        }
    }

    // Метод для запуска очереди треков
    public void playAll() {
        for (Playable playable : playlist) {
            playable.printInfo();
            playable.play();
        }
    }

}
