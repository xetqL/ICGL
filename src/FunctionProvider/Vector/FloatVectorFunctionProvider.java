/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider.Vector;

import DataStructure.Couple;
import DataStructure.Dimension;
import DataStructure.KPoint;
import DataStructure.Vector;
import FunctionProvider.FunctionProvider;
import FunctionProvider.VectorFunctionProvider;

/**
 *
 * @author antho
 */
public class FloatVectorFunctionProvider implements VectorFunctionProvider{
    
    @Override
    public Vector crossProduct(Couple k1k2) {
        Vector<Float> v1 = (Vector<Float>) k1k2.getA();
        Vector<Float> v2 = (Vector<Float>) k1k2.getB();
        Vector<Float> k = new Vector(v1.getDim(), Float.class);
        k.set(Dimension.x, (v1.get(Dimension.z) * v2.get(Dimension.x)) - (v1.get(Dimension.x) * v2.get(Dimension.z)));
        k.set(Dimension.y, (v1.get(Dimension.x) * v2.get(Dimension.y)) - (v1.get(Dimension.y) * v2.get(Dimension.x)));
        k.set(Dimension.z, (v1.get(Dimension.y) * v2.get(Dimension.z)) - (v1.get(Dimension.z) * v2.get(Dimension.y)));
        return k;
    }

    @Override
    public Vector add(Couple k1k2) {
        Vector<Float> v1 = (Vector<Float>) k1k2.getA();
        Vector<Float> v2 = (Vector<Float>) k1k2.getB();
        Vector<Float> k = new Vector<>(v1.getDim(), Float.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i,  v1.get(i) +  v2.get(i));
        }
        return k;
    }
    
    @Override
    public Vector sub(Couple k1k2) {
        Vector<Float> v1 = (Vector<Float>) k1k2.getA();
        Vector<Float> v2 = (Vector<Float>) k1k2.getB();
        Vector<Float> k = new Vector<>(v1.getDim(), Float.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, v1.get(i) -  v2.get(i));
        }
        return k;
    }

    @Override
    public Double dotProduct(Couple k1k2) {
        Vector<Float> v1 = (Vector<Float>) k1k2.getA();
        Vector<Float> v2 = (Vector<Float>) k1k2.getB();
        double res = 0;
        for (int i = 0; i < v1.size(); i++) {
            res += v1.get(i) * v2.get(i);
        }
        return res;
    }

    @Override
    public Vector mul(Vector k1, Number s1) {
        Vector<Float> v1 = (Vector<Float>) k1;
        Vector<Float> k = new Vector<>(k1.getDim(), Float.class);
        for (int i = 0; i < k1.size(); i++) {
            k.set(i, v1.get(i) * (Float) s1);
        }
        return k;
    }
    
}