
package DataStructure;
/**
 *
 * @author antho
 * @param <T1> left type
 * @param <T2> right type
 */
public class Couple<T1, T2> {
    
    private final T1 a;
    private final T2 b;

    public Couple(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public T2 getB() {
        return b;
    }

    @Override
    public String toString() {
        return " ("+a.toString()+" , "+b.toString()+") ";
    }
}
