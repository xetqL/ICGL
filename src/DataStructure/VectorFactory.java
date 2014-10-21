/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author antho
 */
public class VectorFactory {
    public static Vector getVector(Dimension d, Class<? extends Number> c){
		int thirdDimensionValue = Dimension.getThirdDimension().value();
        if(c == Double.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Double> res = new Vector3D<>( c);
                return res;
            }else{
                Vector<Double> res = new Vector<>(d, c);
                return res;                
            }
        }
        
        if(c == Integer.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Integer> res = new Vector3D<>( c);
                return res;
            }else{
                Vector<Integer> res = new Vector<>(d, c);
                return res;                
            }            
        }
        
        if(c == Float.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Float> res = new Vector3D<>( c);
                return res;
            }else{
                Vector<Float> res = new Vector<>(d, c);
                return res;                
            }            
        }
        
        if(c == Long.class){
            if(d.value() == thirdDimensionValue){
                Vector3D<Long> res = new Vector3D<>( c);
                return res;
            }else{
                Vector<Long> res = new Vector<>(d, c);
                return res;                
            }            
        }
        
        return null;
    }
    
    
}
