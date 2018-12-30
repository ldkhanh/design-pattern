package structural.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType == AudioType.mp3) {
            System.out.println("Playing mp3 file. Name : " + fileName);
        } else if (audioType == AudioType.mp4 || audioType == AudioType.vlc) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media " + audioType + " format for support.");
        }
    }
}
