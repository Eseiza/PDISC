public class StoppedState extends PlayerState {

    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("State changed to Playing");
    }

    @Override
    public void pause(MusicPlayer player) {
        player.setState(new PausedState());
        System.out.println("State changed to Paused");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("The System is already stopped");
    }
}
