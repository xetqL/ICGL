/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Boulmier
 */
public class Space extends HashSet<SpaceElement>{
    private final Vector[] unitaries;
    private final Dimension d;
    
    public Space(Dimension d, Class<? extends Number> c) {
        this.d = d;
        if(!Values.zeroes.containsKey(c)) throw new UnsupportedOperationException(c.getName()+" is not supported for the moment");
        unitaries = new Vector[d.value()+1];
        Number[] shiftTab = (Number[]) Array.newInstance(c, d.value()+1);
        Arrays.fill(shiftTab, Values.zeroes.get(c));
        shiftTab[0] = Values.ones.get(c);
        unitaries[0] = new Vector(shiftTab, c);
        for(int i = 1; i<=d.value() ;i++){
            shiftTab[i-1] = Values.zeroes.get(c);
            shiftTab[i]   = Values.ones.get(c);
            unitaries[i] = new Vector(shiftTab, c);
        }
    }
    
    public Vector getUnitary(Dimension d){
        return unitaries[d.value()];
    }

    @Override
    public boolean add(SpaceElement e) {
        return super.add(e);
    }
    
    public void printUnitaries(){
        for(Vector v : unitaries){
            System.out.println(v);
        }
    }
}
