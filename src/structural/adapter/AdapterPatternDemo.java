package structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play(AudioType.mp3, " sfsdfsd.mp3");
        mediaPlayer.play(AudioType.mp4, "sdfsdfsd.mp4");
        mediaPlayer.play(AudioType.vlc, "sdfsfsdf.vlc");
    }
}
