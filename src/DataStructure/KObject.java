/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import config.DimensionConfig;
import java.util.ArrayList;

/**
 * Dimension k point
 *
 * @author antho
 * @param <T>
 */
public abstract class KObject<T extends Number> extends ArrayList<T> implements PlanaryObject{
    protected final Dimension dim;
    private static final Number ZERO = 0.0;

    public KObject(Dimension d) { //initialized as null vector
        dim = d;
        init(dim.value());
    }

    public KObject() {
        dim = DimensionConfig.global_dimension;
        init(dim.value());
    }

    public Dimension getDim() {
        return dim;
    }
    
    protected final void init(int dim) {
        for (int i = 0; i <= dim; i++) {
            this.add((T) ZERO);
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
            return (T) KObject.ZERO;
        }
    }

    /**
     *
     * @param d
     * @param value
     * @throws DataStructure.OutOfVectorDimension
     */
    public void set(Dimension d, T value){
        try{
            if(value.getClass() == get(d).getClass())
                set(d.value(), value);
            else throw new ArithmeticException("Bad number's type !");
        }catch(IndexOutOfBoundsException e){
            System.err.println("Out of Vector Dimension ! ");
        }
    }

    
}
