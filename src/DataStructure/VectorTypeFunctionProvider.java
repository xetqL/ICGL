/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 */
public class VectorTypeFunctionProvider {
     
    public static Function<Couple<KVector,KVector>, KVector> provideFunctions(Class forWhat){
        if(forWhat == Double.class)
            return VectorTypeFunctionProvider::crossDoubleProduct;
        if(forWhat == Float.class)
            return VectorTypeFunctionProvider::crossFloatProduct; 
        if(forWhat == Integer.class)
            return VectorTypeFunctionProvider::crossIntegerProduct;
        
        return null;
    }
    
    private static KVector crossDoubleProduct(Couple k1k2){
        try {
            KVector v1 = (KVector) k1k2.getA();
            KVector v2 = (KVector) k1k2.getB();
            KVector k = new KVector();
            Dimension x=Dimension.getDimension(1),
                      y=Dimension.getDimension(2),
                      z=Dimension.getDimension(3);
            k.set(x, ((double) v1.get(z) * (double) v2.get(x)) - ((double)v1.get(x) * (double) v2.get(z)));
            k.set(y, ((double) v1.get(x) * (double) v2.get(y)) - ((double)v1.get(y) * (double) v2.get(x)));
            k.set(z, ((double) v1.get(y) * (double) v2.get(z)) - ((double)v1.get(z) * (double) v2.get(y)));
            return k;
        } catch (BadDimensionException | OutOfVectorDimension ex) {
            Logger.getLogger(VectorTypeFunctionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private static KVector crossIntegerProduct(Couple k1k2){
        try {
            KVector v1 = (KVector) k1k2.getA();
            KVector v2 = (KVector) k1k2.getB();
            KVector k = new KVector();
            Dimension x=Dimension.getDimension(1),
                      y=Dimension.getDimension(2),
                      z=Dimension.getDimension(3);
            k.set(x, ((int) v1.get(z) * (int) v2.get(x)) - ((int)v1.get(x) * (int) v2.get(z)));
            k.set(y, ((int) v1.get(x) * (int) v2.get(y)) - ((int)v1.get(y) * (int) v2.get(x)));
            k.set(z, ((int) v1.get(y) * (int) v2.get(z)) - ((int)v1.get(z) * (int) v2.get(y)));
            return k;
        } catch (BadDimensionException | OutOfVectorDimension ex) {
            Logger.getLogger(VectorTypeFunctionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private static KVector crossFloatProduct(Couple k1k2){
        try {
            KVector v1 = (KVector) k1k2.getA();
            KVector v2 = (KVector) k1k2.getB();
            KVector k = new KVector();
            Dimension x=Dimension.getDimension(1),
                      y=Dimension.getDimension(2),
                      z=Dimension.getDimension(3);
            k.set(x, ((float) v1.get(z) * (float) v2.get(x)) - ((float)v1.get(x) * (float) v2.get(z)));
            k.set(y, ((float) v1.get(x) * (float) v2.get(y)) - ((float)v1.get(y) * (float) v2.get(x)));
            k.set(z, ((float) v1.get(y) * (float) v2.get(z)) - ((float)v1.get(z) * (float) v2.get(y)));
            return k;
        } catch (BadDimensionException | OutOfVectorDimension ex) {
            Logger.getLogger(VectorTypeFunctionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
