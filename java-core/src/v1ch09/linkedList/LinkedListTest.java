package v1ch09.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: practice-demos
 * @description: This program demonstrates operations on linked lists
 * @author: xiaoboji
 * @create: 2020-07-20 23:11
 */
public class LinkedListTest {
  public static void main(String[] args) {
    List<String> a = new LinkedList<>();
    a.add("Amy");
    a.add("Carl");
    a.add("Eirca");

    List<String> b = new LinkedList<>();
    b.add("Bob");
    b.add("Doug");
    b.add("Frances");
    b.add("Gloria");

    // merge the words from b into a

    ListIterator<String> aIter = a.listIterator();
    Iterator<String> bIter = b.iterator();

    while (bIter.hasNext()) {
      if (aIter.hasNext()) {
        aIter.next();
      }
      aIter.add(bIter.next());
    }

    System.out.println(a);

    // remove every second word from b

    bIter = b.iterator();
    while (bIter.hasNext()) {
      bIter.next();
      if (bIter.hasNext()) {
        bIter.next(); // skip next element
        bIter.remove(); // remove that element
      }
    }

    System.out.println(b);

    // bulk operation:remove all words in b from a
    a.removeAll(b);

    System.out.println(a);
  }
}
