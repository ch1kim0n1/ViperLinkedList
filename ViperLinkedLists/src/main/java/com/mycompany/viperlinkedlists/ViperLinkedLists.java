/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.viperlinkedlists;

/**
 *
 * @author kondraty_946191
 */
public class ViperLinkedLists {

    public static void main(String[] args) {
        
        VLinkedList list = new VLinkedList();

        // Test add method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        //initial list
        System.out.println(list);

        // Test size method
        System.out.println("Size: " + list.size()); // Output: 4

        // Test get method
        System.out.println("Get 2: " + list.get(2)); // Output: 30

        // Test head method
        System.out.println("Head: " + list.head().getValue()); // Output: 10

        // Test insert method
        list.insert(2, 25);

        // Test get method again
        System.out.println("Get 2: " + list.get(2)); // Output: 25

        // Test delete method
        list.delete(40);

        // Test size method again
        System.out.println("Size: " + list.size()); // 4

        // Test remove method
        list.remove(1);

        // Test get method one more time
        System.out.println("Get 1: " + list.get(1)); // 25
        
        //final list
        System.out.println(list);
    }
}
