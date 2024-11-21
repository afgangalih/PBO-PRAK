package soal_3;

public class Movie extends StreamingContent {
    private String director;
    
    public Movie(String title, String duration, String director) {
        super(title, duration);
        this.director = director;
    }
    
    @Override
    public void play() {
        System.out.println("Playing movie: " + title + " directed by " + director);
    }
}
