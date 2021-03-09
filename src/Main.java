
public class Main {

	public static void main(String[] args) {
		Computer c = new Computer();
		Laptop l = new Laptop();
		StationaryComputer sc = new StationaryComputer();
		
		c.turnOn();
		c.playMusic();
		c.turnOff();
		
		l.turnOn();
		l.performDownload();
		l.playVideo();
		l.turnOff();
		
		sc.turnOn();
		sc.turnOff();

	}

}
