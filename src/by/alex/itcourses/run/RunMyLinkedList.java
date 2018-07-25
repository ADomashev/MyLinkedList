package by.alex.itcourses.run;


import by.alex.itcourses.entity.MyLinkedList;

public class RunMyLinkedList {

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<>();

		list.addNodeTail("One");
		list.addNodeTail("Two");
		list.addNodeTail("Three");
		list.addNodeTail("Four");
		
		
		
		for (String string : list) {
			System.out.println(string);
		}

	}

}
