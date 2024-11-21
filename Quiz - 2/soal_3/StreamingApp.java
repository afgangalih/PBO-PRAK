package soal_3;

import java.util.ArrayList;

public class StreamingApp {
    public void streamContent(StreamingContent content) {  // Polymorphic Arguments
        content.play();
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // Heterogeneous Collection
        ArrayList<StreamingContent> playlist = new ArrayList<>();
        
        playlist.add(new Movie("Pengabdi Setan", "2:00:00", "Joko Anwar"));
        playlist.add(new Podcast("Menuju indonesia emas", "2:30", "Tretan Muslim"));
        playlist.add(new MusicVideo("Wirang", "3:30", "Denny Caknan"));
        
        // Object Casting & instanceof
        for (StreamingContent content : playlist) {
            if (content instanceof Movie) {
                Movie movie = (Movie) content;  // Object Casting
                System.out.println("This is a movie: " + movie.getTitle());
            } else if (content instanceof Podcast) {
                Podcast podcast = (Podcast) content;  // Object Casting
                System.out.println("This is a podcast: " + podcast.getTitle());
            } else if (content instanceof MusicVideo) {
                MusicVideo musicVideo = (MusicVideo) content;  // Object Casting
                System.out.println("This is a music video: " + musicVideo.getTitle());
            }
            
            // Polymorphic Arguments in action
            new StreamingApp().streamContent(content);
        }
    }
}
