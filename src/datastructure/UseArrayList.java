package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

		System.out.println(" ");
		System.out.println("Printout the values using while loop with Iterator.....");
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		al.remove(3);
		al.remove("ctg");


		System.out.println(" ");
		System.out.println("Printout the values using For Each loop.....");


//Database connection established
		ConnectToSqlDB connect = new ConnectToSqlDB();

		connect.insertDataFromArrayListToSqlTable(al,"ArrayList", "ArrayData");

		//Data reader added
		List<String> numbers = connect.readDataBase("ArrayList", "ArrayData");
		for(String student:numbers) {
			System.out.println(student);
		}

	}
}
