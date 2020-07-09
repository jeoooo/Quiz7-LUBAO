/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz7lubao;

import generaltreeexample.Tree;
import positionexample.Position;

/**
 *
 * @author Jeo
 */
public interface BinaryTree<E> extends Tree<E> {
    public Position<E> left(Position<E> p) throws IllegalArgumentException;
    public Position<E> right(Position<E> p) throws IllegalArgumentException;
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
