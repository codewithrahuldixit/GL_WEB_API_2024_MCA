package rahul;

import java.util.ArrayList;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=2147483647;
		//x++;
		//int y = (x>2 ? 2 * x : 3 *x);
		//System
		/*
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("oak");
		a1.add("maple");
		a1.add("pine");
		a1.set(2, "willow");
		a1.add(1,"cypress");
		a1.remove(2);
		System.out.println(a1);
		A) ++x^y++ and x++^++x
B) ++x^++y and ++x^++x
C) ++y^x++ and x++^x++
D) y++^x++ and y++^++y
E) x++^++y and y++^y++
*/
		StringBuilder build1 = new StringBuilder("a mustang");
		char [] dest = new char[build1.length()];
		//dest = build1.getChars(2, 6, 0);
		//dest = build1.getChars(2, 6, dest, 0);
		build1.getChars(2, 6, dest, 0);
		//dest = build1.getChars(0, 4);
	//	dest=build1.getChars(2, build1.length());

		String res = new String(dest);
		System.out.println(res);

	}
	public static boolean check(String str) {
		return str.length()>=2&&(str.charAt(1)==str.charAt(0)||check(str.substring(1)));
	}
	public static boolean isValid(int x) {
		return x==2*(x/10+x%10);
	}

}
