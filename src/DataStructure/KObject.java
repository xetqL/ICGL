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

    private static final Number ZERO = 0;

    public KObject(Dimension d) { //initialized as null vector
        init(d.value());
    }

    public KObject() {
        init(DimensionConfig.global_dimension.value());
    }

    private void init(int dim) {
        for (int i = 0; i < dim; i++) {
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
     */
    public void set(Dimension d, T value) throws OutOfVectorDimension {
        try{
            set(d.value(), value);
        }catch(IndexOutOfBoundsException e){
            throw new OutOfVectorDimension();
        }
    }

}
