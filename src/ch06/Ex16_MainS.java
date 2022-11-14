package ch06;

public class Ex16_MainS {

	public static void main(String[] args) {
		Ex16_MyArrayS myArrayS = new Ex16_MyArrayS(4);
		int[] intArray = { 3, 36, 73, 48, 52, 79, 56, 70, 51, 25 };

		System.out.println("========printArray========");
		myArrayS.printArray(intArray);
		myArrayS.setNumperLine(3); // 갯수 세팅을 변경
		myArrayS.printArray(intArray);
		System.out.println("==========================");
		System.out.println("배열의 평균값: " + myArrayS.getAvg(intArray));
		System.out.println("배열의 최소값: " + myArrayS.getMin(intArray));
		System.out.println("배열의 최대값: " + myArrayS.getMax(intArray));
		System.out.println("배열의 제곱의 합: " + myArrayS.getSumOfSquare(intArray));
		
		//기능을 사용하다가 알려주신 평균, 분산, 표준편차...
		// intArray의 분산 = E( X * X ) -  E(X) * E(X)
		double var = myArrayS.getSumOfSquare(intArray) / intArray.length -
				myArrayS.getAvg(intArray) * myArrayS.getAvg(intArray);
		double std =Math.sqrt(var);
		System.out.println("평균" + myArrayS.getAvg(intArray));
		System.out.println("분산"+var);
		System.out.println("표준편차"+std);

	}

}
