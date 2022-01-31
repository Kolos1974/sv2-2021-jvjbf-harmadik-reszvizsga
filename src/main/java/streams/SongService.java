package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SongService {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }


    public Optional<Song> shortestSong() {
        Optional<Song> result = songs.stream()
                .sorted(new Comparator<Song>() {
                    @Override
                    public int compare(Song o1, Song o2) {
                        return o1.getLength() - o2.getLength();
                    }
                })
                .findFirst();
        return result;
    }


    public List<Song> findSongByTitle(String title){
            return songs.stream()
                    .filter(song -> song.getTitle().equals(title))
                    .collect(Collectors.toList());
    }

    public boolean isPerformerInSong(Song song, String find){
            return song
                    .getPerformers()
                    .stream()
                    .anyMatch(performer -> performer.equals(find));
    }


    public List<String> titlesBeforeDate(LocalDate findDate){
            return songs.stream()
                    .filter(song -> song.getRelease().isBefore(findDate))
                    .map(song -> song.getTitle())
                    .collect(Collectors.toList());
    }

}
