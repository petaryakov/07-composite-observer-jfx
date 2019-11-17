package ohm.softa.a07.utils;

import ohm.softa.a07.model.Meal;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class MealsFilterUtility {
	/**
	 * private constructor to avoid instantiation even when the class is inherited
	 */
	private MealsFilterUtility() {
	}

	/**
	 * Filter the given meals to remove non vegetarian ones
	 *
	 * @param mealsToFilter meals to filter
	 * @return list of vegetarian meals
	 */
	public static List<Meal> filterForVegetarian(List<Meal> mealsToFilter) {


			/*//Functional shorthand
			return mealsToFilter
				.stream()
				.filter(Meal::isVegetarian)
				.collect(Collectors.toList());*/


		List<Meal> result = new LinkedList<>();
		 //iterate all the meals
		for (Meal m : mealsToFilter) {
			 //check if meal is vegetarian
			if (m.isVegetarian()) {
				result.add(m);
			}
		}
		return result;
	}
}
