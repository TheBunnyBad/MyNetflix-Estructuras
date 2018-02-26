/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYNETFLIX;

/**
 *
 * @author jham0
 */
public class Node<T> {
    ////////////////////////
    //Atributos
    ///////////////////////
    private T item;
    private Node<T> next;

    /**
     * @return the item
     */
    public T getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(T item) {
        this.item = item;
    }

    /**
     * @return the next
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
