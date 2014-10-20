/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import config.DimensionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Dimension k point
 *
 * @author antho
 * @param <T>
 */
public abstract class KObject<T extends Number> extends ArrayList<T> implements PlanaryObject {

    protected final Dimension dim;
    private static final Map<Class<? extends Number>, Object> zeroes = new HashMap<>();
    static {
        zeroes.put(Integer.class, 0);
        zeroes.put(Double.class, 0.0);
        zeroes.put(Float.class, (float) 0.0);
    }
    protected final Class internType;

    public KObject(Dimension d, Class c) { //initialized as null vector
        dim = d;
        internType = c;
        init(dim.value(), (T) zeroes.get(c));
    }

    public Dimension getDim() {
        return dim;
    }


    protected final void init(int dim, T value) {
        for (int i = 0; i <= dim; i++) {
            this.add(value);
        }
    }

    /**
     *
     * @param d
     * @return value of the D dimension
     */
    public T get(Dimension d) {
        try {
            return this.get(d.value());
        } catch (IndexOutOfBoundsException e) {
            return (T) zeroes.get(internType);
        }
    }

    /**
     *
     * @param d
     * @param value
     */
    public void set(Dimension d, T value) {
        try {
            if (value.getClass() == get(d).getClass()) {
                set(d.value(), value);
            } else {
                throw new ArithmeticException("Bad number's type !");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Out of Vector Dimension ! ");
        }
    }

}
