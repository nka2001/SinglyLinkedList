package com.mycompany.singlylinkedlist;

/**
 * Node class, holds a next pointer (only one since singly linked) as well as the data to hold
 * @author nicka
 * @param <T>
 */
public class Node<T> extends SinglyLinkedListDS{
    
    T data;
    Node next;
    
    
    public Node(){
        this.data = (T) "default";
        this.next = this.head;
    }
    
    public Node(T data){
        this.data = data;
        this.next = this.head;
        
    }
    
    
}
