package com.mycompany.singlylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Linked list data structure class, contains queue operations (push and pop) as
 * well as toString and iterator
 *
 * @author nicka
 * @param <T>
 */
public class SinglyLinkedListDS<T extends Comparable<T>> implements Iterable<T> {

    Node head;//head of the list
    Node tail;//tail of the list
    private int n; //number of elements

    /**
     * default constructor, sets head and tail to null, and number of elements
     * to 0.
     */
    public SinglyLinkedListDS() {
        n = 0;
        head = null;
        tail = null;
    }

    /**
     * stack method push, adds an item into the linked list at the top (head)
     *
     * @param addMe
     * @return
     */
    public T push(T addMe) {
        Node<T> newNode = new Node();//create a new node
        newNode.data = addMe;//set the data in the new node
        newNode.next = head;//set newNode's next to point to head
        head = newNode;//then set head to newNode
        if (n == 0) {//if there arent any elements
            tail = newNode;//point the tail to newNode
        }
        n++;//increment the number of elements
        return addMe;//return the data added
    }

    /**
     * stack operation pop, returns and removes the elements at the top of the
     * stack
     *
     * @return
     */
    public T pop() {
        if (n == 0) {//if there are no elements then return null
            return null;
        }

        T x = (T) head.data;//get the data from the node being popped
        head = head.next;//move head to the next element in the linked list 

        if (--n == 0) {//if there are no elements AFTER a decrement, then set tail to null as well
            tail = null;
        }
        return x;//return the data of the node being popped

    }

    /**
     * iterator, is used by toString to iterate through the linked list
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {

        Iterator<T> iter = new Iterator<T>() {//inner class for iterator

            int position = -1;//starting position is -1
            Node<T> curr = head;//current node starts at the head of the list

            /**
             * hasNext will return true or false if curr is null or not
             *
             * @return
             */
            @Override
            public boolean hasNext() {
                return curr != null;//if curr is not null, then return true, false otherwise
            }

            /**
             * next method, will return the data of the current node and move
             * the current node forward one position.
             */
            @Override
            public T next() {

                if (!hasNext()) {//if there is no more elements, then throw an exception
                    throw new NoSuchElementException();
                }
                T data = curr.data;//get the data of the current node
                curr = curr.next;//move the current node forward one
                position++;//increment the position
                return data;//return the data

            }

        };
        return iter;//return the iter object

    }
    
    /**
     * toString method will print the contents of the linked list
     * @return 
     */
    @Override
    public String toString() {
        Iterator<T> iter = iterator();//use the iterator created

        String str = "{";//start with a brace

        while (iter.hasNext()) {//move through the linked list by checking if there is another node in the linked list
            str += iter.next();//append the contents of the node to the string
            if (iter.hasNext()) {//if there is another node, add a comma, if not then just not add it
                str += ", ";
            }
        }
        str += "}";//at the end, add a brace 
        return str;//return this string
    }

}
