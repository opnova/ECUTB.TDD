
public class XStack {
	int[] buffer;
	int currentIdx;
	int maxIdx;
	public XStack() {
		currentIdx = 0;
		maxIdx = 9;
		buffer = new int[10];
		
	}
	
	public void push(int i) {
		
		if (currentIdx > maxIdx) {
			maxIdx += 10;
			int[] newData = new int[maxIdx];
			for (int j = 0; j < buffer.length; j++) {
				newData[j] = buffer[j];
			}
			buffer = newData;
		}
		
		buffer[currentIdx] = i;
		currentIdx++;
	}
	
	public boolean isEmpty() {
		return currentIdx == 0;
	}	

}
