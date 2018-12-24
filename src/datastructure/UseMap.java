package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfNY = new ArrayList<>();
		cityOfNY.add("bronx");
		cityOfNY.add("queens");
		cityOfNY.add("Brooklyn");
		cityOfNY.add("SI");
		cityOfNY.add("Manhattan");

		List<String> cityOfVA = new ArrayList<>();
		cityOfVA.add("STERLING");
		cityOfVA.add("ARLINGTON");
		cityOfVA.add("ASHBURN");
		cityOfVA.add("TYSON");
		cityOfVA.add("RICHMOND");


		List<String> cityOfUk = new ArrayList<>();
		cityOfUk.add("London");
		cityOfUk.add("Bristol");
		cityOfUk.add("Liverpool");
		cityOfUk.add("York");
		cityOfUk.add("Belfast");


		Map<String, List<String>> list = new HashMap<>();
		list.put("NY",cityOfNY);
		list.put("VA", cityOfVA);
		list.put("UK",cityOfUk);

		System.out.println(list);

		System.out.println(" ");
		System.out.println(" for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " cities " +st.getValue());
		}



		System.out.println(" ");
		System.out.println(" iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
