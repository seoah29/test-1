
public class Solution {
    public static void main(String[] args) {
    	
    	String s = String.valueOf(12345);
    	StringBuilder sb = new StringBuilder(s);
    	sb = sb.reverse();
    	System.out.println(sb);
    	String[] ss = sb.toString().split("");
    	int[] answer = new int[s.length()];
    	
    	for (int i=0; i<s.length(); i++) {
    		answer[i] = Integer.parseInt(ss[i]);
    		System.out.println(answer[i]);
    	}
    }
    
}
