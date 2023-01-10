/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viperlinkedlists;

/**
 *
 * @author kondraty_946191
 */
public class VNode {
  private int value;
  private VNode next;

  // Constructors
  public VNode(int value) {
    this.value = value;
    this.next = null;
  }

  public VNode(int value, VNode next) {
    this.value = value;
    this.next = next;
  }

  // Getters and setters
  public int getValue() {
    return this.value;
  }

  public VNode getNext() {
    return this.next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(VNode next) {
    this.next = next;
  }
}
