package soal_3;

public class MusicVideo extends StreamingContent{
    private String artist;

    public MusicVideo(String title, String duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing music video: " + title + " by " + artist);
    }
}
