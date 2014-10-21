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
public interface IVector extends SpaceElement {
    public Vector add(Vector k);
    public Vector mul(Number k);
    public Vector sub(Vector k);
    public Number dotProduct(Vector k);
}
