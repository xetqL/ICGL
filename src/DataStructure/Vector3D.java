/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import FunctionProvider.ClassFunctionProvider;
import FunctionProvider.FunctionProvider;
import FunctionProvider.VectorFunctionProvider;
import java.util.function.Function;

/**
 *
 * @author Boulmier
 * @param <T>
 */
public class Vector3D<T extends Number> extends Vector<T>{
    
    public Vector3D(Number a, Number b, Number c, Class type) {
        super(Dimension.getThirdDimension() , type);
        this.set(0, (T) a);
        this.set(1, (T) b);
        this.set(2, (T) c);
    }
    
    public Vector3D(Class c) {
        super(Dimension.getThirdDimension(), c);
    }
    /**
     * works only in 3 dimensional vector
     * @param v1
     * @return 
     */
    public Vector3D<T> crossProduct(Vector v1) {
        return (Vector3D<T>) ((VectorFunctionProvider)f).crossProduct(new Couple(this,v1));
    }
}
