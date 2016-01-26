

public class Palindrome_onelinesolution {
	//One line solution
    /*
     * Given a string, determine if a permutation of the string could form a palindrome.
     * For example,
     * "code" -> False, "aab" -> True, "carerac" -> True.
     */
	public static boolean isPalindrome(String s) {
	    return s.equals(new StringBuilder(s).reverse().toString());
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
