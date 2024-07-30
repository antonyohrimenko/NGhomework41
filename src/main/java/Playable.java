public interface Playable {
    void play();

    default void printInfo() {
        System.out.println("This is a playable file.");
    }
}
