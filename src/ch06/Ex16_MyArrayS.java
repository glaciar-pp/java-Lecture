package ch06;

public class Ex16_MyArrayS {
	private int numperLine;

	public Ex16_MyArrayS(int numperLine) {
		this.numperLine = numperLine;
	}

	public int getNumperLine() {
		return numperLine;
	}

	public void setNumperLine(int numperLine) {
		this.numperLine = numperLine;
	}
	double getAvg(int[] arr) {
		int sum = 0;
		for (int element : arr)
			sum += element;
		return (double) sum / arr.length;
	}

	int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr)
			if (min > element)
				min = element;
		return min;
	}

	int getMax(int[] arr) {
		int max = arr[0];
		for (int element : arr)
			if (max < element)
				max = element;
		return max;
	}
		void printArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%4d", arr[i]);
				if ((i + 1) % numperLine == 0 || (i + 1) == arr.length)
					System.out.println();
			}
			System.out.println();
		}		
			int getSumOfSquare(int[] arr) {
				int sum = 0;
				int SumOfSquare = 0;
				for (int element : arr) {
					sum += element;
					SumOfSquare += element * element;
				}
				return SumOfSquare;
			}
}
