package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        songList = new SongList();
    }

    public boolean addSong(String title, double duration){
        return songList.add(new Song(title,duration));
    }


    public boolean addToPlayList(int trackNum, LinkedList<Song> playList){
        Song checkedSong=songList.findSong(trackNum);
        if (checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNum);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong=songList.findSong(title);
        if (checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in this album");
        return false;
    }


    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for(Song track: songs)
                if (track.getTitle().equalsIgnoreCase(title))
                    return track;
            return null;
        }

        private Song findSong(int trackNum){
            if(songs.size()>=trackNum && trackNum>1)
                return songs.get(trackNum-1);
            return null;
        }


    }
}
