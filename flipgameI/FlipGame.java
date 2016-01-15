package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are playing the following Flip Game with your friend: 
 * Given a string that contains only these two characters: + and -,
 * you and your friend take turns to flip two consecutive "++" into "--". 
 * The game ends when a person can no longer make a move and therefore 
 * the other person will be the winner.
 * Write a function to compute all possible states of the string 
 * after one valid move.
 * For example, given s = "++++", after one move, 
 * it may become one of the following states:
 * [
  "--++",
  "+--+",
  "++--"
]
If there is no valid move, return an empty list [].
 */
public class FlipGame {
	 
	  public List<String> generatePossibleNextMoves(String s) {
		  List<String> result = new ArrayList<String>();
		  if(s == null || s.length() <= 0){
			  return result;
		  }
		  
		  char plus = '+';
		  char minus = '-';
		  char[] array = s.toCharArray();
		  for(int i = 0; i < array.length - 1;i++){
			if(array[i] == plus && array[i + 1] == plus){
				s = s.substring(0,i) + "--" + s.substring(i + 2);
				result.add(s);
				s = s.substring(0,i) + "++" + s.substring(i + 2);
			}
		  }
	      return result;
	    }
	  
	  public static void main(String[] args){
		  String s = "+++++++";
		  FlipGame test = new FlipGame();
		  System.out.println(test.generatePossibleNextMoves(s));
	  }
}
