/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singlylinkedlist;

/**
 *
 * @author nicka
 */
public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedListDS s = new SinglyLinkedListDS();
        s.push("the");
        s.push("Nick");
        s.push("Jowe");
        System.out.println(s.toString()); // should print Jowe, Nick, the
        
        s.pop();
        s.push("WOW");
        
        System.out.println(s.toString());//should be WOW, Nick, the
        
        s.push("test");
        s.push("Another");
        s.pop();
        s.pop();
        
        System.out.println(s.toString());//should be the same as the previous printout
    }
}
