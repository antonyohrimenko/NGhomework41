public class Main {

     /*
1. Создайте интерфейс Playable. С двумя методами:
1.1 метод void play()
1.2 default-метод printInfo(), реализация которого сообщает, что мы имеем дело с запускаемым файлом

2. Реализуйте интерфейс Playable в двух классах:
2.1 AudioTrack
2.2 Video

3. Создайте класс MediaPlayer. В нем добавьте возможность добавить трек или видео в список прослушивания.
Используя varargs, добавьте возможномть добавлять несколько треков за раз.
Также добавьте метод для запуска "очереди треков".
Перед запуском каждого трека выводите информацию о каждом треке
     */

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        AudioTrack track1 = new AudioTrack("Song One", "Artist A");
        AudioTrack track2 = new AudioTrack("Song Two", "Artist B");
        Video video1 = new Video("Movie One", "Director X");

        // Добавление треков и видео в список воспроизведения
        mediaPlayer.addToPlaylist(track1, track2, video1);

        // Запуск очереди треков
        mediaPlayer.playAll();
    }
}
