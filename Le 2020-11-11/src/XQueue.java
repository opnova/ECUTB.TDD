//import java.util.Deque;

public class XQueue {
	
	int[] data = null;
	int nextPos = 0;
	int max = 3;
	
	public XQueue() {
		data = new int[3];
		nextPos = 0;
	}
	
	public int Dequeue() throws EmptyException {
		
		if (nextPos == 0) {
			throw new EmptyException();			
		}
		
		nextPos--;
		
		return data[nextPos];
	}

	public void Enqueue(int i) {
		if ( nextPos >= max) {					
			createMoreSpace();
		}
		data[nextPos] = i;
		nextPos++;		
	}

	private void createMoreSpace() {
		max = max + 3;
		int[] temp = new int[max];
		
		for (int j = 0; j < data.length; j++) {
			temp[j] = data[j];
		}
		data = temp;
	}

}
