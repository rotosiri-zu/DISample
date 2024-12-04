package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.Greet;

@SpringBootApplication
public class DiSampleApplication {
	/**
	 * SpringBoot起動
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args)
		.getBean(DiSampleApplication.class).execute();
	}
	
	/** 注入される箇所(インターフェイス) */
	@Autowired
	private Greet g;
	
	/**
	 * 実行
	 */
	private void execute() {
		String msg = g.greeting();
		System.out.println(msg);
	}
}
