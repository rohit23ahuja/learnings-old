package learn.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingForLambda {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 0;
		divideNumbersByKey(numbers, key, wrapperBiConsumerLambda((n, k) -> System.out.println(n / k), ArithmeticException.class));
	}

	private static <I, J, E extends Exception> BiConsumer<I, J> wrapperBiConsumerLambda(BiConsumer<I, J> biConsumer,
			Class<E> clazz) {
		return (n, k) -> {
			try {
				biConsumer.accept(n, k);
			} catch (Exception ex) {
				try {
					E exCast = clazz.cast(ex);
					System.out.println("Expcetion handling in wrapper lambda "+exCast.getMessage());
				} catch (Exception e) {
					System.out.println("Exception while class cast");
				}
			}
		};
	}

	private static void divideNumbersByKey(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : numbers) {
			biConsumer.accept(i, key);
		}
	}

}
