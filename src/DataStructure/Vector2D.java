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
public class Vector2D extends Couple<Double, Double> implements PlanaryObject{

    public Vector2D(Double a, Double b) {
        super(a, b);
    }

    public Double getX() {
        return getA();
    }

    public Double getY() {
        return getB();
    }

    public Double scalar(Vector2D v1){
        return this.getX() *v1.getX() + this.getY() * v1.getY();
    }
    
    public Vector2D add(Vector2D v1) {
        return new Vector2D(
                this.getX() + v1.getX(),
                this.getY() + v1.getY()
        );
    }

    public Vector2D sub(Vector2D v1) {
        return new Vector2D(
                this.getX() - v1.getX(),
                this.getY() - v1.getY()
        );
    }

    public Vector2D mul(Double x) {
        return new Vector2D(
                this.getX() * x,
                this.getY() * x
        );
    }
}
