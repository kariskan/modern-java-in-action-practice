package org.example.chapter2.quiz1;

import java.util.ArrayList;
import java.util.List;
import org.example.chapter2.quiz1.appleformatter.AppleFormatter;
import org.example.chapter2.quiz1.appleformatter.PrettyAppleFormatter;
import org.example.chapter2.quiz1.appleformatter.SimpleAppleFormatter;
import org.example.domain.Apple;

public class Main {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		prettyPrintApple(inventory, new PrettyAppleFormatter());
		prettyPrintApple(inventory, new SimpleAppleFormatter());
	}

	public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
		for (Apple apple : inventory) {
			System.out.println(appleFormatter.accept(apple));
		}
	}

}
