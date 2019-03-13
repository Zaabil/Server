
public class Testing {

	public static void main(String args[]) {
<<<<<<< HEAD
		testMethod();
	}
=======


	}


	public static int[] count(int[] arr, int r) {
		if (arr == null || arr.length == 0) return null;

		int[] countArray = new int[r + 1];
		
		// Initialize countArray to all 0's.
		for (int i = 0; i < countArray.length; i++) {
			countArray[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= r && arr[i] > 0) {
				countArray[arr[i]]++;
			}
		}

		return countArray;
	}
>>>>>>> Branch1
}