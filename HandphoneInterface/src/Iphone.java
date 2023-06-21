import interfaces.Phone;

public class Iphone implements Phone{
	private int volume;
	private boolean isPowerOn;
	
	public Iphone() {
		// set volume awal atau default
		this.volume = 50;
	}
	
	@Override
	public void powerOn() {
		isPowerOn = true;
		System.out.println("Handphone menyala...");
		System.out.println("Selamat datang di Xiaomi");
		System.out.println("Android version 10");
	}
	@Override
	public void powerOff() {
		isPowerOn = false;
		System.out.println("Mematikan Handphone");
	}
	
	@Override
	public void volumeUp() {
		if (isPowerOn) {
			if (this.volume == MAX_VOLUME) {
				System.out.println("Volume sudah paling maksimal");
				System.out.println("Volume = " + this.volume + "&");
			} else {
				this.volume += 10;
				System.out.println("Volume sekarang " + this.volume + "%");
			}
		} else {
			System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
		}	
	}
	@Override
	public void volumeDown() {
		if (isPowerOn) {
			if (this.volume == MIN_VOLUME) {
				System.out.println("Volume sudah paling minimal");
				System.out.println("Volume = " + this.volume + "%");
			} else {
				this.volume -= 10;
				System.out.println("Volume sekarang " + this.volume + "%");
			}
		} else {
			System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
		}
	}

	//getter and setter
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
}
