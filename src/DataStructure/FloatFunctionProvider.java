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
public class FloatFunctionProvider implements FunctionProvider{
    @Override
    public KVector crossProduct(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(),Float.class);
        k.set(Dimension.x, ((float) v1.get(Dimension.z) * (float) v2.get(Dimension.x)) - ((float) v1.get(Dimension.x) * (float) v2.get(Dimension.z)));
        k.set(Dimension.y, ((float) v1.get(Dimension.x) * (float) v2.get(Dimension.y)) - ((float) v1.get(Dimension.y) * (float) v2.get(Dimension.x)));
        k.set(Dimension.z, ((float) v1.get(Dimension.y) * (float) v2.get(Dimension.z)) - ((float) v1.get(Dimension.z) * (float) v2.get(Dimension.y)));
        return k;
    }

    @Override
    public KVector add(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(),Float.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (float) v1.get(i) + (float) v2.get(i));
        }
        return k;
    }

    @Override
    public KVector sub(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        KVector k = new KVector(v1.getDim(),Float.class);
        for (int i = 0; i < v1.size(); i++) {
            k.set(i, (float) v1.get(i) - (float) v2.get(i));
        }
        return k;
    }

    @Override
    public Number dotProduct(Couple k1k2) {
        KVector v1 = (KVector) k1k2.getA();
        KVector v2 = (KVector) k1k2.getB();
        float res = 0;
        for (int i = 0; i < v1.size(); i++) {
            res += (float) v1.get(i) * (float) v2.get(i);
        }
        return res;
    }

    @Override
    public KVector mul(KVector k1, Number s1) {
        KVector k = new KVector(k1.getDim(),Float.class);
        for (int i = 0; i < k1.size(); i++) {
            k.set(i, (float) k1.get(i) * (float) s1);
        }
        return k;
    }
}
