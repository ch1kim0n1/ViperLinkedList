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

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.insert(4, 20);
        System.out.println(list);

        list.delete(3);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
