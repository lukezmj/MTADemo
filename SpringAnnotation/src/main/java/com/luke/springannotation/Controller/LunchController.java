package com.luke.springannotation.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luke.springannotation.model.Lunch;

@Configuration
public class LunchController {
	@Bean
	public Lunch Wangui() {
		Lunch wangui = new Lunch();
		wangui.setVender("Wangui");
		return wangui;
	}
}
