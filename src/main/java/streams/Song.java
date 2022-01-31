package streams;

import java.time.LocalDate;
import java.util.List;

public class Song {
    private String title;
    private int length;
    private List<String> performers;
    private LocalDate release;

    public Song(String title, int length, List<String> artists, LocalDate published) {
        this.title = title;
        this.length = length;
        this.performers = artists;
        this.release = published;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public LocalDate getRelease() {
        return release;
    }

}
