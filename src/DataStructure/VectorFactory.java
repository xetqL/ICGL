/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.Double;
import DataStructure.Vector3D;

/**
 *
 * @author antho
 */
public class VectorFactory {
    public static Vector getVector(Dimension d, Class c){
		int thirdDimensionValue = Dimension.getThirdDimension().value();
        if(c == Double.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Double> res = new Vector3D<>( c);
                return res;
            }else{
                KVector<Double> res = new KVector<>(d, c);
                return res;                
            }
        }
        
        if(c == Integer.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Integer> res = new Vector3D<>( c);
                return res;
            }else{
                KVector<Integer> res = new KVector<>(d, c);
                return res;                
            }            
        }
        
        if(c == Float.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Float> res = new Vector3D<>( c);
                return res;
            }else{
                KVector<Float> res = new KVector<>(d, c);
                return res;                
            }            
        }
        
        if(c == Long.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Long> res = new Vector3D<>( c);
                return res;
            }else{
                KVector<Long> res = new KVector<>(d, c);
                return res;                
            }            
        }
        
        return null;
    }
    
    
}
