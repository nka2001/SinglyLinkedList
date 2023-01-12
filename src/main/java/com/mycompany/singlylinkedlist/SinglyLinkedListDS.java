/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singlylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author nicka
 * @param <T>
 */
public class SinglyLinkedListDS<T extends Comparable<T>> implements Iterable<T> {

    Node dummy;
    private int n; //number of elements

    public void dosomething() {
        Node u = new Node();

        System.out.println(u.data);

        Node u2 = new Node("HI");

        System.out.println(u2.data);
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T> iter = new Iterator<T>() {

            int position = -1;
            Node<T> curr = dummy.next;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = curr.data;
                curr = curr.next;
                position++;
                return data;

            }

        };
        return iter;

    }

    public String toString() {
        Iterator<T> iter = iterator();

        String str = "{";

        while (iter.hasNext()) {
            str += iter.next();
            if (iter.hasNext()) {
                str += ", ";
            }
        }
        str += "}";
        return str;
    }

}
