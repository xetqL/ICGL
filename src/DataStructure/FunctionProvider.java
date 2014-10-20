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
public interface FunctionProvider {
    public KVector crossProduct(Couple k1k2);
    public KVector add(Couple k1k2);
    public KVector sub(Couple k1k2);
    public KVector mul(KVector k1, Number s1);
    public Number  dotProduct(Couple k1k2);
    public Double distance(KPoint p1, KPoint p2);
}
