package AdapterPattern;

public interface IVideoPlayer {
	public void playAudio(String filename);
	public void playVideo(String filename);
}

class AudioPlayerAdapter implements IVideoPlayer {

	public IAudioPlayer media;
	
	public AudioPlayerAdapter() {
		media = new MP3Player();
	}

	@Override
	public void playAudio(String filename) {
		media.play("", filename);
	}

	@Override
	public void playVideo(String filename) {
		System.out.println("Generate some random patterns.");
	}
	
	
}

class MKVPlayer implements IVideoPlayer {

	@Override
	public void playAudio(String filename) {
		System.out.println("Playing audio from mkv file " + filename);
	}

	@Override
	public void playVideo(String filename) {
		System.out.println("Decoding " + filename + " using MKV Player.");
	}
	
}

class MP4Player implements IVideoPlayer {

	@Override
	public void playAudio(String filename) {
		System.out.println("Playing audio from mp4 file " + filename);
	}

	@Override
	public void playVideo(String filename) {
		System.out.println("Decoding " + filename + " using MP4 Player.");
	}
}

class WEBPPlayer implements IVideoPlayer {

	@Override
	public void playAudio(String filename) {
		System.out.println("Playing audio from webp file " + filename);
	}

	@Override
	public void playVideo(String filename) {
		System.out.println("Decoding " + filename + " using WEBP Player.");
	}
        
}
