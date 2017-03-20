package com.first;

public class Main {

	public static void main(String[] args) {
		
		Bird[] b = new Bird[4];
		
	b[0] = new Chicken("have feathers", "lay eggs");
	b[1] = new Penguin("no feathers", "lay eggs");
	b[2] = new Eagle("have feathers", "lay eggs");
	b[3] = new Swallow("have feathers", "lay eggs");
	
	for (Bird bird : b) {
		System.out.println(bird + " ");
		bird.fly();
	}
		
	}
	
}
