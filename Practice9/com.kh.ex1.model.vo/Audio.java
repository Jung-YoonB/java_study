package com.kh.ex1.model.vo;

public class Audio implements RemoteControl {
	
	private int volume;
	
	public Audio() {
		
	}

	@Override
	public void turnON() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		int minVolume = 0;
		int maxVolume = 10;
		boolean isVolume = minVolume <= volume && volume <= maxVolume;
		
		if (isVolume) {
			this.volume = volume;
			System.out.printf("TV 볼륨을 %d로 조절합니다.\n", volume);
		} else if (volume < 0) {
			System.out.println("TV 볼륨이 이미 최소입니다.");
		} else if (volume > 10) {
			System.out.println("TV 볼륨이 이미 최대입니다.");
		}
		
	}
	
}
