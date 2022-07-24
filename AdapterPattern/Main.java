package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		ap.play("mp3", "Joy.mp3");
		System.out.println("-----");
		ap.play("mkv", "Naimur.mkv");
		System.out.println("-----");
		ap.play("mp4", "Redwan.mp4");
		System.out.println("-----");
		ap.play("webp", "Nokshi.webp");
                
                
	}

}
