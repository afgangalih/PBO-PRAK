package soal_3;

public class Podcast extends StreamingContent {
    private String host;

    public Podcast(String title, String duration, String host) {
        super(title, duration);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
    
}
