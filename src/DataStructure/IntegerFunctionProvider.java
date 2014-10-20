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
public class IntegerFunctionProvider implements FunctionProvider {
    @Override
    public KVector crossProduct(Couple k1k2) {
        KVector<Integer> v1 = (KVector<Integer>) k1k2.getA();
        KVector<Integer> v2 = (KVector<Integer>) k1k2.getB();
        KVector<Integer> k = new KVector(v1.getDim(), Integer.class);
        k.set(Dimension.x, (v1.get(Dimension.z) * v2.get(Dimension.x)) - (v1.get(Dimension.x) * v2.get(Dimension.z)));
        k.set(Dimension.y, (v1.get(Dimension.x) * v2.get(Dimension.y)) - (v1.get(Dimension.y) * v2.get(Dimension.x)));
        k.set(Dimension.z, (v1.get(Dimension.y) * v2.get(Dimension.z)) - (v1.get(Dimension.z) * v2.get(Dimension.y)));
        return k;
    }

    @Override
    public KVector add(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(), Integer.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (int) v1.get(i) + (int) v2.get(i));
        }
        return k;
    }

    @Override
    public KVector sub(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(), Integer.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (int) v1.get(i) - (int) v2.get(i));
        }
        return k;
    }

    @Override
    public Number dotProduct(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        int res = 0;
        for (int i = 0; i < v1.size(); i++) {
            res += (int) v1.get(i) * (int) v2.get(i);
        }
        return res;
    }

    @Override
    public KVector mul(KVector k1, Number s1) {
        KVector k = new KVector(k1.getDim(), Integer.class);
        for (int i = 0; i < k1.size(); i++) {
            k.set(i, (int) k1.get(i) * (int) s1);
        }
        return k;
    }
}
