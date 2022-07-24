package AdapterPattern;
public interface IAudioPlayer {
	public void play(String type, String filename);
}

class VideoPlayerAdapter implements IAudioPlayer {

	public IVideoPlayer media;
	
	public VideoPlayerAdapter(String type) {
		media = VideoPlayerFactory.getVideoPlayer(type);
	}
	
	@Override
	public void play(String type, String filename) {
		System.out.println("You can write method body in your own way.");
		media.playAudio(filename);
	}
	
}

class MP3Player implements IAudioPlayer {
	@Override
	public void play(String type, String filename) {
		System.out.println("Playing mp3 file " + filename);
	}
}

class AudioPlayer implements IAudioPlayer {

	@Override
	public void play(String type, String filename) {
		if (type.equals("mp3")) {
			new MP3Player().play(type, filename);
		}
		
		else {
			IAudioPlayer media = new VideoPlayerAdapter(type);
			media.play(type, filename);
		}
	}
	
}