package Exersice16_1;

/*
 Write a method called set that accepts an index and a value and sets the list’s element
 at that index to have the given value. You may assume that the index is between 0
 (inclusive) and the size of the list (exclusive).
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);

    list1.set(2,10);
    System.out.println(list1);

}
}