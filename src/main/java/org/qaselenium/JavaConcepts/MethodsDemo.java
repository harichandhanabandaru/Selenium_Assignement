package org.qaselenium.JavaConcepts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsDemo {
	public static void main(String[] args) {
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();


//		Basic java concepts
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum + "is the value stored in the myNum variable");
		System.out.println(website);

		//Arrays -
		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		int[] arr2 = {1, 2, 4, 5, 6};
		System.out.println(arr2[0]);

		//for loop arr.length - 5
		for (int i = 0; i < arr.length; i++) //4
		{
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] names = {"rahul", "shetty", "selenium"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (String s : names) {
			System.out.println(s);
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add(" shetty");
		a.add(" pinky");
		System.out.println(" Hello hi " + a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		for (String val : a) {
			System.out.println(val);
		}
		System.out.println(a.contains(" shetty"));
		String[] namess = {"rahul", "shetty", "selenium"};
		List<String> nameArrayList = Arrays.asList(namess);
		nameArrayList.contains("selenium");


		//	 Strings in java
		String s1 = "Rahul shety academy";
		String s2 = new String("Welcome");

		String s3 = "Rahul good boy";
		String[] spliedSring = s3.split(" ");
		System.out.println(spliedSring[0]);

		String[] spliedSring1 = s3.split("good");
		System.out.println(spliedSring1[0]);

		for (int i = 0; i < s3.length(); i++) {
			System.out.println(s3.charAt(i));
		}


	}

	public String getData() {
		System.out.println("hello world");
		return "rahul shetty";
	}

	public static String getData2() {
		System.out.println("hello world");
		return "rahul shetty";
	}


}

