package terminalAlgorithms;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Graph {
	
	public Graph() {
		
	}

	public void printGraph(int posCheck, ArrayList<Integer> arrayList) throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\n\n\n\n\n");
		for(int i = 0; i < arrayList.size(); i++) {
			for(int j = 0; j < arrayList.get(i); j++) {
				if(posCheck == i) {
					System.out.print('X');
				} else {
					System.out.print('O');
				}
			}
			System.out.println();
		}
	}
	
}
