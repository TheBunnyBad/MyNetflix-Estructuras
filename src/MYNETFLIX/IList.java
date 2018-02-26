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
public interface IList<T> {
              
    public void add(Node<T> node);
    
    public void setItem(T p);
    
    public void remove(int i);
    
    public void setNext(Node<T> node);
    
    public void addAtLast(Node<T> node);    
        
    public Node<T> getNode(int i);
    
    public boolean contains(T p);
    
    public int size();
    
}
