public class AudioTrack implements Playable {

    private String title;
    private String artist;

    public AudioTrack(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }


    @Override
    public void play() {
        System.out.println("Playing audio track: " + title + " by " + artist);
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
    }
}
