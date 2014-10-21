/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import FunctionProvider.VectorFunctionProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author antho
 * @param <T>
 */
public class Vector<T extends Number> extends KObject<T> implements IVector{
    
    public Vector(Dimension d, Class<? extends Number> c){
        super(d, c, true, Vector.class);
    }
    
    public Vector(List<T> a, Class<? extends Number> c){
        super(Dimension.getDimension(a.size()), c, false, Vector.class);
        this.addAll(a);
    }
    
    public Vector(T[] a, Class<? extends Number> c){
        super(Dimension.getDimension(a.length), c, false, Vector.class);
        this.addAll(Arrays.asList(a));
    }
    
    private boolean valid(Number a, Number b){
        return a.getClass() == b.getClass();
    }  

    @Override
    public Vector add(Vector k) {
        return ((VectorFunctionProvider)f).add(new Couple(this,k));
    }

    @Override
    public Vector mul(Number k) {
        return ((VectorFunctionProvider)f).mul(this, k);    
    }

    @Override
    public Vector sub(Vector k) {
        return ((VectorFunctionProvider)f).sub(new Couple(this,k));    
    }

    @Override
    public Number dotProduct(Vector k) {
        return (T) ((VectorFunctionProvider)f).dotProduct(new Couple(this,k));
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder().append('(');
        Iterator<T> it = this.iterator();
        s.append(it.next().toString());
        while(it.hasNext()) s.append(',').append(' ').append(((T) it.next()).toString());
        s.append(')');
        return s.toString();
    }
}
