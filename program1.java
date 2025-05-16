/*1. Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and
a LinkedList to perform the following operations with different functions directed as follows*/
// program for demonstrating List Interface

public class ListInterfaceDemo {
public static void main(String[] args) {
// Creating different types of Lists
List<String> arrayList = new ArrayList<>();
List<String> linkedList = new LinkedList<>();
System.out.println("=== ArrayList Demonstrations ===");
// 1. Adding elements
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Orange");
System.out.println("After adding elements: " + arrayList);
// 2. Adding element at specific index
arrayList.add(1, "Mango");
System.out.println("After adding Mango at index 1: " + arrayList);
// 3. Adding multiple elements
arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
System.out.println("After adding multiple elements: " + arrayList);
// 4. Accessing elements
String firstFruit = arrayList.get(0);
System.out.println("First fruit: " + firstFruit);
// 5. Updating elements
arrayList.set(1, "Kiwi");
System.out.println("After updating index 1 to Kiwi: " + arrayList);
// 6. Removing elements
arrayList.remove("Orange"); // Remove by object
arrayList.remove(0); // Remove by index
System.out.println("After removing elements: " + arrayList);
// 7. Searching elements
boolean containsKiwi = arrayList.contains("Kiwi");
int grapeIndex = arrayList.indexOf("Grape");
System.out.println("Contains Kiwi? " + containsKiwi);
System.out.println("Index of Grape: " + grapeIndex);
// 8. List size
System.out.println("List size: " + arrayList.size());

// 9. Iterating over list
System.out.println("\nIterating using for-each loop:");
for (String fruit : arrayList) {
System.out.println(fruit);
}
// 10. Using Iterator
System.out.println("\nIterating using Iterator:");
Iterator<String> iterator = arrayList.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
// 11. Sorting
Collections.sort(arrayList);
System.out.println("After sorting: " + arrayList);
// 12. Sublist
List<String> subList = arrayList.subList(0, 2);
System.out.println("Sublist (0-2): " + subList);
// 13. Clearing the list
arrayList.clear();
System.out.println("After clearing: " + arrayList);
// LinkedList specific operations
System.out.println("\n=== LinkedList Demonstrations ===");
LinkedList<String> fruits = new LinkedList<>();
fruits.addFirst("Apple");
fruits.addLast("Banana");
fruits.add("Orange");
System.out.println("LinkedList: " + fruits);
System.out.println("First element: " + fruits.getFirst());
System.out.println("Last element: " + fruits.getLast());
fruits.removeFirst();
fruits.removeLast();
System.out.println("After removing first and last: " + fruits);
}
}



//Exercises for Lab 1

//Array List

/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not
( Hint : Use ArrayListObj.contains() )*/
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		if(ls.contains("red")) {
			System.out.println("available");
		}else {
			System.out.println("available not");
		}
	}

}


2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList (using remove by index and remove by
object)
3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()

5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index

Linked List

1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )
5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))
