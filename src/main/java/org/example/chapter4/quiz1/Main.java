package org.example.chapter4.quiz1;

import java.util.List;
import java.util.stream.Collectors;
import org.example.domain.Dish;
import org.example.domain.Type;

public class Main {

	public static void main(String[] args) {
		List<Dish> menu = List.of(
			new Dish("pork", false, 800, Type.MEAT),
			new Dish("beef", false, 700, Type.MEAT),
			new Dish("chicken", false, 400, Type.MEAT),
			new Dish("french fries", true, 530, Type.OTHER),
			new Dish("rice", true, 350, Type.OTHER),
			new Dish("season fruit", true, 120, Type.OTHER),
			new Dish("pizza", true, 550, Type.OTHER),
			new Dish("prawns", false, 300, Type.FISH),
			new Dish("salmon", false, 450, Type.FISH)
		);
		List<String> highCaloricDishes = menu.stream()
			.filter((d) -> d.getCalories() > 300)
			.map(Dish::getName)
			.collect(Collectors.toList());
	}

}
