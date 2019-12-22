package com.chlyah.maven.mvnTest;

import java.util.stream.IntStream;

public class Mapping {

	public Mapping(){
		exp01();
	}
	
	void exp01() {
		IntStream
		.range(1, 15)
		.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		new Mapping();

	}

}
