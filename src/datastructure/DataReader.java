package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


		FileReader fr = null;
		BufferedReader br = null;
		String data = "";
		String storedata = "";
		String text = "/Users/lazim/IdeaProjects/NovemberMidterm2018/MidtermNovember2018/src/data/self-driving-car";
		try {
			fr = new FileReader(textFile);
			System.out.println("your File has been found.");
		} catch (Exception e) {
			System.out.println("File b did not found");
		}
		try {
			br = new BufferedReader(fr);
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				storedata += data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] storeArr = storedata.split(" ");
		List<String> storeList = new LinkedList<>();
		Stack<String> storeStack = new Stack<String>();
		for (String elements : storeArr) {
			storeList.add(elements);
			storeStack.push(elements);
		}
		System.out.println("\nPeek at the stack: " + storeStack.peek() + " ");
		System.out.println("\nSearch for cars object: " + storeStack.search("cars"));
		System.out.println("\nRetrieve in FIFO order:");
		Iterator<String> itrator = storeList.iterator();
		while (itrator.hasNext()) {
			System.out.print(itrator.next() + " ");
		}

		System.out.println("\n\nRetrieve in LIFO order:");
		while (!storeStack.isEmpty()) {
			System.out.print(storeStack.pop() + " ");


		}

	}
}
