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

    public KSegment(KPoint a, KPoint b) {
        super(a, b);
    }
    
    public KPoint getStart(){
        return getA();
    }
    
    public KPoint getEnd(){
        return getB();
    }
}
