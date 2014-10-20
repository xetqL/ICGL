/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import java.util.Iterator;

/**
 *
 * @author antho
 * @param <T>
 */
public class KVector<T extends Number> extends KObject<T> implements Vector{
    
    
    public KVector(Dimension d, Class c){
        super(d, c);
    }
    
    private boolean valid(Number a, Number b){
        return a.getClass() == b.getClass();
    }  

    @Override
    public KVector add(Vector k) {
        FunctionProvider f = VectorClassFunctionProvider.provideFunctions(this.get(0).getClass());
        return f.add(new Couple(this,k));
    }

    @Override
    public KVector mul(Number k) {
        FunctionProvider f = VectorClassFunctionProvider.provideFunctions(this.get(0).getClass());
        return f.mul(this, k);    
    }

    @Override
    public KVector sub(Vector k) {
        FunctionProvider f = VectorClassFunctionProvider.provideFunctions(this.get(0).getClass());
        return f.sub(new Couple(this,k));    
    }

    @Override
    public Number dotProduct(Vector k) {
        FunctionProvider f = VectorClassFunctionProvider.provideFunctions(this.get(0).getClass());
        return (T) f.dotProduct(new Couple(this,k));
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder().append('(');
        Iterator<T> it = this.iterator();
        s.append(it.next().toString());
        while(it.hasNext()) s.append(',').append(((T) it.next()).toString());
        s.append(')');
        return s.toString();
    }
}
