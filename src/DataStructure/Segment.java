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
public class Segment extends Couple<Point, Point> implements PlanaryObject{

    public Segment(Point a, Point b) {
        super(a, b);
    }
    
    public Point getStart(){
        return getA();
    }
    
    public Point getEnd(){
        return getB();
    }
}
