package rahul;

import java.util.ArrayList;

public class MainDriver {
	public static int func(int [] arr , int i,int result) {
		if(i<arr.length) return func(arr,i+1,result*arr[i]);
		else return result;
	}
public static void main(String[] args) {
	//int arr [] = {2,3,4,1};
	//System.out.println(func(arr,1,1));
	 ClassLoader loader = ClassLoader.getSystemClassLoader();
	 loader.setDefaultAssertionStatus(true);
	ArrayList<Integer> a1 = new ArrayList<>();
	try {
		int k=0;
	assert (!a1.isEmpty());
	assert (k!=0) : "k is zero";
	int x=0;
	for(int i=0;i<a1.size();i++)
		x=x+1;
	//a1.get(i);
	assert(x==a1.size());
	
	}
	catch (AssertionError e) {
	System.out.println(e);
	}
}
}
