package com.javaabc.designpatterns;
interface MediaPlayer{
	public void play(String audioType,String fileName);
}
interface AdvancedMediaPlayer{
	public void playVlc(String fileName);
	public void playMp4(String fileName);
}
class VlcPlayer implements AdvancedMediaPlayer{
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file.name");	
	}
	public void playMp4(String fileName) {}
}
class Mp4Player implements AdvancedMediaPlayer{
	public void playVlc(String fileName) {}
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file.name");
	}
}
class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advancedMediaPlayer;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer=new VlcPlayer();
		}
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer=new Mp4Player();
		}
	}
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		}
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing mp3 file. Name: "+fileName);
		}
		else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Invalid media. "+audioType+"format not support");
		}
	}
}
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
