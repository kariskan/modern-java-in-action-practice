package org.example.chapter2.quiz1.appleformatter;

import org.example.domain.Apple;

public class SimpleAppleFormatter implements AppleFormatter {

	@Override
	public String accept(Apple a) {
		return "Apple: " + a.getColor() + ", " + a.getWeight() + "g";
	}
}
