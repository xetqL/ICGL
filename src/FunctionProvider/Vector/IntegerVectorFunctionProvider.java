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
public class IntegerVectorFunctionProvider implements VectorFunctionProvider {
    
    @Override
    public Vector crossProduct(Couple k1k2) {
        Vector<Integer> v1 = (Vector<Integer>) k1k2.getA();
        Vector<Integer> v2 = (Vector<Integer>) k1k2.getB();
        Vector<Integer> k = new Vector(v1.getDim(), Integer.class);
        k.set(Dimension.x, (v1.get(Dimension.z) * v2.get(Dimension.x)) - (v1.get(Dimension.x) * v2.get(Dimension.z)));
        k.set(Dimension.y, (v1.get(Dimension.x) * v2.get(Dimension.y)) - (v1.get(Dimension.y) * v2.get(Dimension.x)));
        k.set(Dimension.z, (v1.get(Dimension.y) * v2.get(Dimension.z)) - (v1.get(Dimension.z) * v2.get(Dimension.y)));
        return k;
    }

    @Override
    public Vector add(Couple k1k2) {
        Vector<Integer> v1 = (Vector<Integer>) k1k2.getA();
        Vector<Integer> v2 = (Vector<Integer>) k1k2.getB();
        Vector<Integer> k = new Vector<>(v1.getDim(), Integer.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i,  v1.get(i) +  v2.get(i));
        }
        return k;
    }
    
    @Override
    public Vector sub(Couple k1k2) {
        Vector<Integer> v1 = (Vector<Integer>) k1k2.getA();
        Vector<Integer> v2 = (Vector<Integer>) k1k2.getB();
        Vector<Integer> k = new Vector<>(v1.getDim(), Integer.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, v1.get(i) -  v2.get(i));
        }
        return k;
    }

    @Override
    public Double dotProduct(Couple k1k2) {
        Vector<Integer> v1 = (Vector<Integer>) k1k2.getA();
        Vector<Integer> v2 = (Vector<Integer>) k1k2.getB();
        double res = 0;
        for (int i = 0; i < v1.size(); i++) {
            res += v1.get(i) * v2.get(i);
        }
        return res;
    }

    @Override
    public Vector mul(Vector k1, Number s1) {
        Vector<Integer> v1 = (Vector<Integer>) k1;
        Vector<Integer> k = new Vector<>(k1.getDim(), Integer.class);
        for (int i = 0; i < k1.size(); i++) {
            k.set(i, v1.get(i) * (Integer) s1);
        }
        return k;
    }
}
