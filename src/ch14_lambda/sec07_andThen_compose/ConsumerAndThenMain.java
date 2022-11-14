package ch14_lambda.sec07_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenMain {

	public static void main(String[] args) {
		//기존 식
//		Consumer<Member> consumerA = m -> {
//			System.out.println("ConsumerA: "+ m.getName());
		
		//람다 특성 활용, 줄인 식
			Consumer<Member> consumerA = m -> System.out.println("ConsumerA: "+ m.getName());
			Consumer<Member> consumerB = m -> System.out.println("ConsumerB: "+ m.getId());
			
			Consumer<Member> consumerAB = consumerA.andThen(consumerB);
			consumerAB.accept(new Member("홍길동", "hong", null));

	}
}
