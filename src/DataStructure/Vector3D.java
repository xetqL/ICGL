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
public class Vector3D extends Triplet<Double, Double, Double> implements PlanaryObject{

    public Vector3D(Double a, Double b, Double c) {
        super(a, b, c);
    }

    public Double getX() {
        return getA();
    }

    public Double getY() {
        return getB();
    }

    public Double getZ() {
        return getC();
    }

    public Vector3D cross(Vector3D v1) {
        return new Vector3D(
                (this.getZ() * v1.getX()) - (this.getX() * v1.getZ()),
                (this.getX() * v1.getY()) - (this.getY() * v1.getX()),
                (this.getY() * v1.getZ()) - (this.getZ() * v1.getY())
        );
    }

    public Vector3D add(Vector3D v1) {
        return new Vector3D(
                this.getX() + v1.getX(),
                this.getY() + v1.getY(),
                this.getZ() + v1.getZ()
        );
    }

    public Vector3D sub(Vector3D v1) {
        return new Vector3D(
                this.getX() - v1.getX(),
                this.getY() - v1.getY(),
                this.getZ() - v1.getZ()
        );
    }

    public Vector3D mul(Double x) {
        return new Vector3D(
                this.getX() * x,
                this.getY() * x,
                this.getZ() * x
        );
    }

    public Double scalar(Vector3D v1) {
        return this.getX() * v1.getX() + 
               this.getY() * v1.getY() + 
               this.getZ() * v1.getZ();
    }
}
