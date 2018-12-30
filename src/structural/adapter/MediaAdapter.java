package structural.adapter;


public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        if (audioType == AudioType.vlc) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType == AudioType.mp4) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType == AudioType.mp4) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType == AudioType.vlc) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
