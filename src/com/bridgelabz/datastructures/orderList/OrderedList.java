package com.bridgelabz.datastructures.orderList;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To define a orderlist
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class OrderedList<G extends Comparable<G>> {

	// to create a new empty list
	public static <G extends Comparable<G>> OrderedList<G> orderedlist() {
		return new OrderedList<G>();
	}

	// to add an item to the list
	public static <G extends Comparable<G>> void add(G item) {
		SingleLinkedList.addSort(item);
	}

	// to find the size of the list
	public static int size() {
		return SingleLinkedList.size();
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return SingleLinkedList.isEmpty();
	}

	// to return a index of a particular value
	public static <G extends Comparable<G>> int index(G item) {
		return SingleLinkedList.index(item);
	}

	// to check whethrt the item is present or not
	public static<G extends Comparable<G>> boolean search(G item) {

		return SingleLinkedList.search(item);
	}

	// to remove a specified item from the list
	public static <G extends Comparable<G>> void remove(G item) {
		SingleLinkedList.remove(item);
	}

	// to fetch the last item as well as to remove it
	public static <G extends Comparable<G>> G pop() {

		return SingleLinkedList.pop();
	}

	public static void display() {
		SingleLinkedList.display();
	}

	// to fetch an item from specified position and to revove it
	public static <G extends Comparable<G>> G pop(int pos) {

		return SingleLinkedList.removeByPosition(pos);
	}

}
