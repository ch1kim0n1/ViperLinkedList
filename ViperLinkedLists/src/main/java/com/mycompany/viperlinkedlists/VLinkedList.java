/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viperlinkedlists;

/**
 *
 * @author kondraty_946191
 */
public class VLinkedList {
    
    private VNode head;

    public VLinkedList() {
        this.head = null;
    }
    
    public VNode head(){
        
        return this.head;
        
    }
    
    public int get(int index) {
  if (index < 0) {
    throw new IndexOutOfBoundsException();
  }
  VNode current = this.head;
  for (int i = 0; i < index; i++) {
    if (current == null) {
      throw new IndexOutOfBoundsException();
    }
    current = current.getNext();
  }
  if (current == null) {
    throw new IndexOutOfBoundsException();
  }
  return current.getValue();
}

// Method to remove a node at a specific index
public void remove(int index) {
  if (index < 0) {
    throw new IndexOutOfBoundsException();
  }
  if (index == 0) {
    this.head = this.head.getNext();
    return;
  }
  VNode current = this.head;
  for (int i = 0; i < index - 1; i++) {
    if (current == null) {
      throw new IndexOutOfBoundsException();
    }
    current = current.getNext();
  }
  if (current == null || current.getNext() == null) {
    throw new IndexOutOfBoundsException();
  }
  current.setNext(current.getNext().getNext());
}

// Method to delete the first occurrence of a specific value
public void delete(int value) {
  if (this.head == null) {
    return;
  }
  if (this.head.getValue() == value) {
    this.head = this.head.getNext();
    return;
  }
  VNode current = this.head;
  while (current.getNext() != null && current.getNext().getValue() != value) {
    current = current.getNext();
  }
  if (current.getNext() != null) {
    current.setNext(current.getNext().getNext());
  }
}

// Method to add a value to the end of the linked list
public void add(int value) {
  VNode newNode = new VNode(value);
  if (this.head == null) {
    this.head = newNode;
    return;
  }
  VNode current = this.head;
  while (current.getNext() != null) {
    current = current.getNext();
  }
  current.setNext(newNode);
}

// Method to insert a value at a specific index
public void insert(int index, int value) {
  if (index < 0) {
    throw new IndexOutOfBoundsException();
  }
  if (index == 0) {
    this.head = new VNode(value, this.head);
    return;
  }
  VNode current = this.head;
  for (int i = 0; i < index - 1; i++) {
    if (current == null) {
      throw new IndexOutOfBoundsException();
    }
    current = current.getNext();
  }
  if (current == null) {
    throw new IndexOutOfBoundsException();
  }
  current.setNext(new VNode(value, current.getNext()));
}

// Method to get the size of the linked list
public int size() {
  int size = 0;
  VNode current = this.head;
  while (current != null) {
    size++;
    current = current.getNext();
  }
  return size;
}



    @Override
    public String toString() {
        //returns the list in array format
        // [item, item, ....]
        /*
        VLinkedList list = new VLinkedList();

        // Test add method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        //initial list
        //System.out.println(list);

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
        //System.out.println(list);
*/        
           String output = "[ ";
           if (this.head == null) {
            
            return "";
        }
           VNode current = this.head;
           while (current.getNext() != null) {
             output = output + current.getValue() + ", ";
             current = current.getNext();
             if(current.getNext() == null){
                 output = output + current.getValue() + " ]";
             }
            }

        
        
        
        
        
        
        
        return output;

        
}
    
    
}
