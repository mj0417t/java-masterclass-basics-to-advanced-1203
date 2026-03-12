package dev.lpa.ll2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for(Song song: songs){
            if(song.getTitle().equalsIgnoreCase(title))
                return song;
        }
        return null;
    }

    public boolean addToPlayList(int trackNum, LinkedList<Song> playList){
        if(songs.size()>trackNum){
            for(Song song:playList){
                songs.add(trackNum++,song);
            }
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        for(Song song: songs){
            if(song.getTitle().equalsIgnoreCase(title)){
                songs.addAll(playList);
                return true;
            }
        }
        return false;
    }

    public void printAlbum(){
        for(Song song: songs){
            System.out.println(song);
        }
    }

}
