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
public interface Vector {
    public KVector add(Vector k);
    public KVector mul(Number k);
    public KVector sub(Vector k);
    public Number dotProduct(Vector k);

}
