package studies.BinaryIndexedTree;

public class BIT {
	int[] internalArray;
	int arraySize;

	public BIT (int[] inputArray) {
		internalArray = null;
		initializeBIT(inputArray);
	}
	
	void incrementValue(int value, int index) {
		
		int indexToModify = index + 1;
		
		while(indexToModify < arraySize) {
			internalArray[indexToModify] += value;
			indexToModify += (indexToModify & -indexToModify);
		}
	}
	
	int query(int index) {
		int indexToRetrieve = index + 1;
		int retValue = 0;
		while(indexToRetrieve > 0) {
			retValue += internalArray[indexToRetrieve];
			indexToRetrieve -= (indexToRetrieve & -indexToRetrieve);
		}
		
		return retValue;
	}
	
	private void initializeBIT(int[] inputArray) {
		// Initialize internal array;
		// Zeroth index is Sentinel.
		arraySize = inputArray.length + 1;
		internalArray = new int[arraySize];
		
		for(int i = 0; i < arraySize; i++)
			internalArray[i] = 0;
		
		for(int i = 1; i < arraySize; i++) {
			int valueToBeAdded = inputArray[i - 1];
			internalArray[i] += valueToBeAdded;
			int k = i;
			while( k < arraySize) {
				k += (k & -k);
				internalArray[k] += valueToBeAdded;
			}
		}
	}	
}
