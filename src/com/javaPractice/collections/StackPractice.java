package com.javaPractice.collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stackOfPlayingCards();
	}
	
	public static void stackOfPlayingCards() {
		
		Stack<String> playingCards = new Stack<>();
		playingCards.push("Jack");
		playingCards.push("Queen");
		playingCards.push("King");
		playingCards.push("Ace");
		System.out.println(playingCards);
		
		System.out.println(playingCards.pop());
		System.out.println(playingCards.pop());
		
		System.out.println(playingCards);
		System.out.println(playingCards.peek());
		System.out.println(playingCards);
		playingCards.remove(1);
		System.out.println(playingCards);
		
		//((3+4)/5-20)*12
		//12*(20-5/(4+3))

	}

}
