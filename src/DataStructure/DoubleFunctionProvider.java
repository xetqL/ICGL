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
public class DoubleFunctionProvider implements FunctionProvider {
    
    @Override
    public KVector crossProduct(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(), Double.class);
        k.set(Dimension.x, ((double) v1.get(Dimension.y) * (double) v2.get(Dimension.z)) - ((double) v1.get(Dimension.z) * (double) v2.get(Dimension.y)));
        k.set(Dimension.y, ((double) v1.get(Dimension.z) * (double) v2.get(Dimension.x)) - ((double) v1.get(Dimension.x) * (double) v2.get(Dimension.z)));
        k.set(Dimension.z, ((double) v1.get(Dimension.x) * (double) v2.get(Dimension.y)) - ((double) v1.get(Dimension.y) * (double) v2.get(Dimension.x)));
        return k;
    }

    @Override
    public KVector add(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(), Double.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (double) v1.get(i) + (double) v2.get(i));
        }
        return k;
    }

    @Override
    public KVector sub(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(), Double.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (double) v1.get(i) - (double) v2.get(i));
        }
        return k;
    }

    @Override
    public Number dotProduct(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        double res = 0.0;
        for (int i = 0; i < v1.size(); i++) {
            res += (double) v1.get(i) * (double) v2.get(i);
        }
        return res;
    }

    @Override
    public KVector mul(KVector k1, Number s1) {
        KVector k = new KVector(k1.getDim(), Double.class);
        for (int i = 0; i < k1.size(); i++) {
            k.set(i, (double) k1.get(i) * (double) s1);
        }
        return k;
    }
}
