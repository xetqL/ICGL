
package DataStructure;
/**
 *
 * @author antho
 * @param <T1> left type
 * @param <T2> center type
 * @param <T3> right type
 */
public abstract class Triplet<T1,T2, T3> {
    
    private final T1 a;
    private final T2 b;
    private final T3 c;

    public Triplet(T1 a, T2 b,T3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T1 getA() {
        return a;
    }

    public T2 getB() {
        return b;
    }
    
    public T3 getC() {
        return c;
    }

    @Override
    public String toString() {
        return " ("+a.toString()+","+b.toString()+","+c.toString()+") ";
    }
}
