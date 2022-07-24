package AdapterPattern;

public class VideoPlayerFactory {
	public static IVideoPlayer getVideoPlayer(String type) {
		IVideoPlayer player = null;
		if (type.equals("mp4")) {
			player = new MP4Player();
		}
		
		else if (type.equals("mkv")) {
			player = new MKVPlayer();
		}
		
		else if (type.equals("webp")) {
			player = new WEBPPlayer();
		}
		
		return player;
	}
}
