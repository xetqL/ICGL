/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Boulmier
 */
public class KSegment extends Couple<KPoint,KPoint> implements SpaceElement{

    public <T extends Number> KSegment(KPoint<T> a, KPoint<T> b) {
        super(a, b);
    }
    
    public KPoint getStart(){
        return getA();
    }
    
    public KPoint getEnd(){
        return getB();
    }
}
