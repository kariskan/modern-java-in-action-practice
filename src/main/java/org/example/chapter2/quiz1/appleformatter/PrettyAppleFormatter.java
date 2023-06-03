package org.example.chapter2.quiz1.appleformatter;

import org.example.domain.Apple;

public class PrettyAppleFormatter implements AppleFormatter {

	@Override
	public String accept(Apple a) {
		String characteristic = a.getWeight() > 150 ? "heavy" : "light";
		return "A " + characteristic + " " + a.getColor() + " apple";
	}
}
