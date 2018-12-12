package lab8.prob4;

public interface QuadFunction<S, T, U, V, R> {
	R apply(S s, T t, U u, V v);
}
