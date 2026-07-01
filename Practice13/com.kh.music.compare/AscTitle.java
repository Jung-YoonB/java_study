package com.kh.music.model.compare;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	/**
	 * 곡명 기준 오름차순 정렬 기준(Comparator)을 제공합니다.
	 * (곡명이 같으면 가수명 오름차순으로 정렬)
	 */	
	@Override
	public int compare(Music o1, Music o2) {
		// 오름차순 : 1번이 먼저
		// 내림차순 : 2번이 먼저
		if (o1.getTitle().compareTo(o2.getTitle()) != 0) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
		return o1.getSinger().compareTo(o2.getSinger());
	
	}	
}
