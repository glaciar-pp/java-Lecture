package practice_221104;

import java.util.HashSet;

/**
 * 
 * [ , ? . ] 제거하기
 * 단어가 몇개인가?
 * 여러번 등장한 단어는 몇회 등장하였는가?
 *
 */
public class Q03_CountWord {

	public static void main(String[] args) {
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";
		System.out.println(text.length());
// String cleanText = text.replaceAll("[\\.,\\?]","");
//System.out.println(text.replaceAll("[^a-z, A-Z]", ""));
		String cleanText = text.replaceAll("[^A-Za-z -]", "");
		System.out.println(cleanText.length());

		String[] textArr = cleanText.split(" ");
		System.out.println("단어의 갯수: " + textArr.length);
		
		//고유 단어의 갯수...이건 다음주에 제대로 배울 예정. 제네릭, 다이아몬드 연산자
		HashSet<String>hs = new HashSet<>();
		for(String word : textArr)
			hs.add(word.toLowerCase());
		System.out.println("고유단어의 갯수: "+hs.size());

	}

}
