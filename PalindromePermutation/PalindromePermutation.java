package Leetcode;

import java.util.Hashtable;
import java.util.Set;

/*
 * Given a string, determine if a permutation of the string could form a palindrome.
 * For example,
 * "code" -> False, "aab" -> True, "carerac" -> True.
 */
public class PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
		if (s == null || s.length() <= 1) {
			return true;
		}
	
		Hashtable<Character,Integer> hash = new Hashtable<Character,Integer>();
		char[] array = s.toCharArray();
		for(char x : array){
			if(hash.get(x) == null){
				hash.put(x, 1);
			}else{
				int count = hash.get(x);
				hash.put(x, count + 1);
			}
		}
		//count odd values
		int resultcount = 0;
		 Set<Character> keys = hash.keySet();
		for(char x : hash.keySet()){
			int currentcount = hash.get(x);
			if(currentcount % 2 == 1){
				resultcount++;
			}
			if(resultcount > 1){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		PalindromePermutation test = new PalindromePermutation();
		String s1 = "carerac";
		String s2 = "code";
		String s3 = "aab";
		System.out.println(s1+" "+test.canPermutePalindrome(s1));
		System.out.println(s2+" "+ test.canPermutePalindrome(s2));
		System.out.println(s3+" "+test.canPermutePalindrome(s3));
	}
}
