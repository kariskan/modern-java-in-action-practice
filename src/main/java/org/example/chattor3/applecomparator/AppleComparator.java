package org.example.chattor3.applecomparator;

import java.util.Comparator;
import org.example.domain.Apple;

public class AppleComparator implements Comparator<Apple> {

	@Override
	public int compare(Apple o1, Apple o2) {
		return o1.getWeight() - o2.getWeight();
	}
}
