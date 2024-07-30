public class Video implements Playable {
    private String title;
    private String director;

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title + " directed by " + director);
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
    }
}
