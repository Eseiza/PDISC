public class PausedState extends PlayerState {

    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("State changed to Playing");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("The System is already paused");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("State changed to Stopped");
    }

}
