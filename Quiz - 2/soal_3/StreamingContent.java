package soal_3;

public abstract class StreamingContent {
    public String title;
    public String duration;

    public StreamingContent(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract void play();

    public String getTitle() {
        return title;
    }
}
