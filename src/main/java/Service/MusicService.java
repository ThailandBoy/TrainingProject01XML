package Service;

import Entity.ClassicalMusic;
import Entity.Music;
import Entity.RockMusic;

import java.util.ArrayList;
import java.util.List;

public class MusicService {
    private List<Music> musicList = new ArrayList<>();
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    public MusicService(){}

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public void setMusicList(){
        musicList.add(classicalMusic);
        musicList.add(rockMusic);
    }
}
