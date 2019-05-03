package learn.streams;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Employee implements Stream<Employee> {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spliterator<Employee> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stream<Employee> sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> onClose(Runnable closeHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stream<Employee> filter(Predicate<? super Employee> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> map(Function<? super Employee, ? extends R> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream mapToInt(ToIntFunction<? super Employee> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream mapToLong(ToLongFunction<? super Employee> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super Employee> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> flatMap(Function<? super Employee, ? extends Stream<? extends R>> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream flatMapToInt(Function<? super Employee, ? extends IntStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream flatMapToLong(Function<? super Employee, ? extends LongStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream flatMapToDouble(Function<? super Employee, ? extends DoubleStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> sorted(Comparator<? super Employee> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> peek(Consumer<? super Employee> action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> limit(long maxSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Employee> skip(long n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(Consumer<? super Employee> action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forEachOrdered(Consumer<? super Employee> action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> A[] toArray(IntFunction<A[]> generator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee reduce(Employee identity, BinaryOperator<Employee> accumulator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> reduce(BinaryOperator<Employee> accumulator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <U> U reduce(U identity, BiFunction<U, ? super Employee, U> accumulator, BinaryOperator<U> combiner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super Employee> accumulator, BiConsumer<R, R> combiner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R, A> R collect(Collector<? super Employee, A, R> collector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> min(Comparator<? super Employee> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> max(Comparator<? super Employee> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean anyMatch(Predicate<? super Employee> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allMatch(Predicate<? super Employee> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean noneMatch(Predicate<? super Employee> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findAny() {
		// TODO Auto-generated method stub
		return null;
	}

}
