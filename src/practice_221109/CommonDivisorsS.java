package practice_221109;
/**
 * -더하기-
 * int sum = 0;
 * for(...){
 * 		sum += ...;
 * }
 * -곱하기-
 * int product = 1;
 * for(...){
 * 		product *= ...;
 * }
 * -리스트 업-
 * List<Integer> list = new ArrayList<>();
 * for(...){
 * 		list.add();
 * }
 */
import java.util.ArrayList;
import java.util.List;

public class CommonDivisorsS {

	public static void main(String[] args) {
		List<Integer> list = getCommonDivisors(12, 24);
		for(int i :list)
			System.out.println(i);

	}
//정말 복잡한 수학연산하는 경우 아니면 Array 안쓰고 요즘은 다 List 사용함!!
	public static List<Integer> getCommonDivisors(int a, int b) {
		List<Integer> list = new ArrayList<>();
		int min = (a < b) ? a : b;

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				list.add(i);
		}

		return list;
	}
}