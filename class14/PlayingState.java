public class PlayingState extends PlayerState {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("The System is already playing");
    }

    @Override
    public void pause(MusicPlayer player) {
        player.setState(new PausedState());
        System.out.println("State changed to Pause");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("State changed to Stopped");
    }

}
