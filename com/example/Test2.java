package com.example;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		int l = 0;
		while (6> lotto.size()) {
			l = (int) ((Math.random()*45)+1);
			lotto.add(l);
		}
		
		System.out.println(lotto);
		System.out.println(lotto.size());
	}

}
