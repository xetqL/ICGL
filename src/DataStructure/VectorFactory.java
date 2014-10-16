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
		int thirdDimensionValue = Dimension.getThirdDimension.value();
        if(c == Double.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Double> res = new Vector3D<>();
                return res;
            }else{
                KVector<Double> res = new KVector<>(d);
                return res;                
            }
        }
        
        if(c == Integer.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Integer> res = new Vector3D<>();
                return res;
            }else{
                KVector<Integer> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == Float.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Float> res = new Vector3D<>();
                return res;
            }else{
                KVector<Float> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == BigInteger.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<BigInteger> res = new Vector3D<>();
                return res;
            }else{
                KVector<BigInteger> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == Short.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Short> res = new Vector3D<>();
                return res;
            }else{
                KVector<Short> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == BigDecimal.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<BigDecimal> res = new Vector3D<>();
                return res;
            }else{
                KVector<BigDecimal> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == Byte.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Byte> res = new Vector3D<>();
                return res;
            }else{
                KVector<Byte> res = new KVector<>(d);
                return res;                
            }            
        }
        
        if(c == Long.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Long> res = new Vector3D<>();
                return res;
            }else{
                KVector<Long> res = new KVector<>(d);
                return res;                
            }            
        }
        
        return null;
    }
    
    
}
