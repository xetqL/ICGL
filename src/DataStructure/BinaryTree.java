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
public class BinaryTree {

    private BinaryTree parent = null;
    private BinaryTree left = null, right = null;
    public double value;

    public BinaryTree(double valueRoot) {
        this.value = valueRoot;
    }

    public BinaryTree(double valueRoot, BinaryTree parent) {
        this.value=valueRoot;
        this.parent=parent;
    }

    public boolean find(double value) {

        if (this.value == value) {
            return true;
        }

        if (this.value < value && right != null) {
            return right.find(value);
        }

        if (this.value > value && left != null) {
            return left.find(value);
        }

        return false;
    }

    public boolean add(double value) {
        if (this.value > value) {
            if (left == null) {
                left = new BinaryTree(value);
                return true;
            } else {
                if (right != null) {
                    return left.add(value);
                }
            }
        }

        if (this.value < value) {
            if (right == null) {
                right = new BinaryTree(value);
                return true;
            } else {
                if (left != null) {
                    return right.add(value);
                }
            }
        }

        return false;
    }
    public BinaryTree getRight(){
        return right;
    }
    
    public BinaryTree getLeft(){
        return left;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(').append(this.value);
        
        if (left != null) {
            sb.append("\nLEFT\t->").append(this.left.toString());
        }
        if (right != null) {
            sb.append("\nRIGHT\t->").append(this.right.toString());
        }

        return sb.append(')').toString();
    }

}
