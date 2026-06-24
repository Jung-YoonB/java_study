package com.kh.ex1.model.vo;

public class Television implements RemoteControl {

	private int volume;
	
	public Television() {
		
	}

	@Override
	public void turnON() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		
		/*
		// 최대 볼륨 10, 최소 볼륨 0으로 제한
		// => 전달 받은 값(volume)의 범위 제한
		if (isVolume) {
			this.volume = volume;
			System.out.println("TV 볼륨을 " + volume + "로 조절합니다.");
		} else {
			Syste.out.println("TV 볼륨 범위에 해당되지 않습니다. 조절할 수 없습니다.");
		}
		*/
		
	}
	
}
