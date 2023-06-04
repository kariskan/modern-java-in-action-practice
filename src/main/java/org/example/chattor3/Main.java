package org.example.chattor3;

import static org.example.domain.Color.RED;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.example.domain.Apple;

public class Main {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		inventory.add(new Apple(4, RED));
		inventory.add(new Apple(3, RED));
		inventory.add(new Apple(2, RED));
		inventory.add(new Apple(1, RED));
		inventory.sort(Comparator.comparing(apple -> apple.getWeight()));
	}

}
