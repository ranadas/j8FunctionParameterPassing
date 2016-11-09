package ooad.funclayer;

/**
 * Created by x148128 on 08/11/2016.
 * Use this function for passing 3 arguments
 */
@FunctionalInterface
public interface DaoInputFunction<A, B, C, R> {
    R performTask(A a, B b, C c);
}
