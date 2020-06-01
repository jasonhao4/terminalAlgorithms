package terminalAlgorithms;

import java.util.ArrayList;

public class BubbleSort {
	Graph graph;
	ArrayList<Integer> arrayList;
	
	public BubbleSort(ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
		graph = new Graph();
	}
	
	public void sort() throws InterruptedException{
		int sizeOfArray = arrayList.size();
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray-i-1; j++) {
				graph.printGraph(j, arrayList);
				if(arrayList.get(j) > arrayList.get(j+1)) {
					int temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(j + 1));
					arrayList.set(j + 1, temp);
				}
			}
		}
	}
	
	public void printArray() throws InterruptedException {
		graph.printGraph(0, arrayList);
		System.out.println("BubbleSort: " + arrayList.toString());
	}
}
