package Section_10_List_ArrayList_LinkedList_Iterator_Autoboxing.CodingExercise46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title){

        for (Song song : songs){
            if (song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false;
    }


    public boolean addToPlayList(int truckNumber, LinkedList<Song> playList){
        int index = truckNumber -1;
        if (index >= 0 && index < songs.size()){
            Song song = songs.get(index);
            playList.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if (song != null){
            playList.add(song);
            return true;
        }
        return false;
    }
}
