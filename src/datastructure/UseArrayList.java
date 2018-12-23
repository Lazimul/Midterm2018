package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList al = new ArrayList();
		al.add("dhaka");
		al.add("sylhet");
		al.add("ctg");
		al.add("khulna");
		System.out.println("these are the cities");

		for (int i = 0; i < al.size(); i++) {
			System.out.println("cities :" + al.get(i));
		}
		al.remove("khulna");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("cities :" + al.get(i));

		}

	}
}
