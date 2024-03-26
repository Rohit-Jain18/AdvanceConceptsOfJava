import java.util.*;
public class CollectionFramework{
    public static void main(String[] args) {
                                       //list {Interface}
        List list = new ArrayList();
        list.add(1);
        list.add("rohit jain ");
        list.add(40.7);
        list.add(false);
        System.out.println(list);// O/P -<> [1, rohit jain , 40.7, false]
        // this is not a good practise because when want fetch  some generic/homogeneous  data so this not a good practise
//ArrayList{Class extends interface List }
        System.out.println("---------------------------------------------------------");
       ArrayList <Integer> List = new ArrayList<>();
       List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(4);
        System.out.println(List);
        System.out.println("element at index 0: "+List.get(0));
        List.set(0,9);
        System.out.println("updated Arraylist"+ List);
        System.out.println("element at index 0: "+List.get(0));
//        for (int i : List) {
//            System.out.println(i+" ");
//        }
      Collections.sort(List);
        System.out.println("Sorted array list"+List);
//LinkedList  {class}->
       LinkedList linkedList = new LinkedList<Integer> ();
       linkedList.add(0, 100);
       linkedList.add(1, 97);
       linkedList.add(2,78);
       linkedList.add(98);
       linkedList.remove(0);
        System.out.println(linkedList);
        System.out.println("---------------------------------------------------------");
//#Vectors -> vectors are slower than ArrayList because vector are synchronized and thread safe
     Vector vector = new Vector<String>();
     vector.add("mY NAME IS :");
     vector.add("Rohit jain ");
     vector.add("hello bro");
        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
        System.out.println("---------------------------------------------------------");

//# Stack --> Stack extends vectors class
      Stack <String> stack = new Stack<>();
      // push-> used to inset ele. pop-> used to delete ele.  peek-> is used to show the top ele.
        stack.push("Krishn");
        stack.push("Radha ");
        stack.push("rajeev");
        stack.push("rohit ");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("--------------------------------------------------------------------");

              //# HashSet {is a class that implements  set interface }
        HashSet <String> hashset = new HashSet<>();
        hashset.add("rohit");
        hashset.add("Rohit");
        hashset.add("johit");
        hashset.add("Jain");
        System.out.println(hashset);
        hashset.remove("johit");
        System.out.println(hashset);
       boolean iscontain = hashset.contains("Rohit");
        System.out.println(iscontain);
        System.out.println("---------------------------------------------------------");

        //#LinkedListHashSet {class which Implements Set interface}
        LinkedHashSet <Integer> llhs = new LinkedHashSet<>();
        llhs.add(15);
        llhs.add(16);
        llhs.add(17);
        llhs.add(19);
        System.out.println(llhs);
        llhs.remove(15);
        System.out.println(llhs);
        System.out.println("---------------------------------------------------------");

        // treeSet {class TreeSet ->implements SortedSet interface --> SortedSet extends Set }
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        System.out.println("TreeSet"+ ts);//    O/p --> TreeSet[1, 2, 3]
       int size= ts.size();

        System.out.println("treeSet size:"+ size);
        System.out.println("------------------------------------------------------------");

        // ---------------->Queue Interface
        // Queue using linked list
        Queue <Integer> q = new LinkedList<>();
        //  offer -> used to insert the element in queue , poll-> is used to delete the element from queue  , peek -> is used to top element of the queue
       q.offer(12);
        q.offer(79);
        q.offer(79);
        q.offer(46);
        q.offer(78);
        System.out.println("queue using linked list:"+ q);
        q.poll();
        System.out.println("deleting element from front fifo"+q);
        System.out.println("peek element: "+q.peek());
        System.out.println("---------------------------------------------------------");

        // deque is the interface (doubly  ended queue )
        Deque <Integer> deq = new ArrayDeque<>();
        deq.offer(14);//  <-- should be deleted
        deq.offerFirst(15);//  <-- should be deleted
        deq.offerLast(13);
        deq.offerLast(13);
        deq.offer(65);
        deq.offer(79);//  <-- should be deleted
        deq.pollFirst();
        deq.poll();
        deq.pollLast();
        System.out.println("DEqueue :"+deq);// Output Equeue :[13, 13, 65]
        System.out.println(deq.peek());// output ------------->13   |   |
        System.out.println(deq.peekFirst());// output ------------>13   |
        System.out.println(deq.peekLast());// output ----------------->65

        System.out.println("---------------------------------------------------------");

        // Priority Queue is class
        PriorityQueue <Integer > pq = new PriorityQueue<>(Comparator.reverseOrder());
        //Comparator.reverseOrder()  --> we can use this method in () in constructor as parameter
        // when want largest no. to print first position
        pq.offer(1);
        pq.offer(2);
        pq.offer(9);
        pq.offer(3);
        pq.offer(7);
        System.out.println(pq);
        // other function are same is dequeue or queue
        System.out.println("---------------------------------------------------------");

    }
}

