/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 * @param <T>
 */
public class KVector<T extends Number> extends KObject<T>{
    
    public KVector() {
        super();
    }
    
    public KVector(Dimension d){
        super(d);
    }
        
    /**
     * works only in 3 dimensional vector
     * @return 
     */
    private KVector<T> crossProduct(KVector v1) {
        try {
            KVector result = (KVector) VectorTypeFunctionProvider.provideFunctions(Double.class);
            T a = (T) v1.get(1);
            return result;
        } 
        catch (BadDimensionException | OutOfVectorDimension ex) {
            return null;
        }
    }
}
