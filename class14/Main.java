public class Main {
    public static void main(String[] args) {
        // Instancio MusicPlayer
        MusicPlayer MP = new MusicPlayer();

        MP.setState(new PlayingState());

        // Los pruebo

        MP.play();

        System.out.println("\n--------------------\n");

        MP.pause();

        System.out.println("\n--------------------\n");

        MP.pause();

        System.out.println("\n--------------------\n");

        MP.stop();

        System.out.println("\n--------------------\n");

        MP.stop();
    }
}
