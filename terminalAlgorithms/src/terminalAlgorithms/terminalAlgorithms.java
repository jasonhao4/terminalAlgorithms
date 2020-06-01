package terminalAlgorithms;

import java.util.ArrayList;
import java.util.Random;

public class terminalAlgorithms {
	
	public static ArrayList<Integer> generateArrayList(int sizeOfArray) {
		Random rand = new Random();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i < sizeOfArray; i++) {
			arrayList.add(rand.nextInt(25) + 1);
		}
		return arrayList;
	}
	
	public static void main(String [] args) throws InterruptedException {
		
		ArrayList<Integer> arrayList = generateArrayList(15);
		System.out.println("ArrayList: " + arrayList.toString());
		BubbleSort bubble = new BubbleSort(arrayList);
		bubble.sort();
		bubble.printArray();
	}
}
