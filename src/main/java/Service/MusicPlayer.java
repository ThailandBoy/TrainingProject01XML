package Service;

import Entity.Music;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayer {
    private Music music;
    private double length;
    private String size;
    private MusicService musicService;

    public MusicPlayer(){};
    // Ввод зависимости через конструктор
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(MusicService musicService) {this.musicService = musicService;}

    public void playMusic(){
        System.out.println(music.getSong());
    }
    public void playMusicList(){
        musicService.setMusicList();
        musicService.getMusicList().forEach(e -> System.out.println(e.getSong()));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
