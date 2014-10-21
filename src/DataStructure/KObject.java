/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import FunctionProvider.ClassFunctionProvider;
import FunctionProvider.FunctionProvider;
import java.util.ArrayList;

/**
 * Dimension k point
 *
 * @author antho
 * @param <T>
 */
public abstract class KObject<T extends Number> extends ArrayList<T> implements SpaceElement {

    protected final Dimension dim;
    protected final Class internType;
    protected final FunctionProvider f;

    public KObject(Dimension d, Class<? extends Number> c, boolean init, Class<? extends KObject> what) { //initialized as null vector
        dim = d;
        internType = c;
        if (init) {
            if (!Values.zeroes.containsKey(c)) {
                throw new UnsupportedOperationException(c.getName() + " is not supported for the moment");
            }
            init(dim.value(), (T) Values.zeroes.get(c));
        }
        f = ClassFunctionProvider.provideFunctions(c, what);
    }

    public Dimension getDim() {
        return dim;
    }

    @Override
    public T get(int index) {
        if (index < this.size()) {
            return super.get(index);
        } else {
            return (T) Values.zeroes.get(internType);
        }
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
        return this.get(d.value());
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
