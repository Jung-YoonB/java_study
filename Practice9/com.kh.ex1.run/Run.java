package com.kh.ex1.run;

import com.kh.ex1.model.vo.Audio;
import com.kh.ex1.model.vo.RemoteControl;
import com.kh.ex1.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new Television();
		rc[1] = new Audio();			
		
		for (RemoteControl r : rc) {
			r.turnON();
			
			if (r instanceof Television) {
				r.setVolume(7);	
				r.turnOff();
				System.out.println("---");
			} else if (r instanceof Audio) {
				r.setVolume(5);
				r.turnOff();
			}
			
		}
		
	}

}
