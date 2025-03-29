package Java.Java_Collections;

import java.util.*;

public class Collections_Prac {  
  
  public static Comparator<Integer> getComparator(){
    return new Comparator<Integer>() {
      @Override
      public int compare(Integer num1, Integer num2){
        if(num1 > num2){
          return -1;
        }
        else if(num1 < num2){
          return 1;
        }
        return 0;
      }
    };
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // Data  dataObj1 = new Data(10, "Aman");
    // System.out.println(dataObj1.getName());

    /* 
     * ArrayList
     
    ArrayList<Integer> aList = new ArrayList<>();
    aList.add(10);
    aList.add(16);
    aList.add(20);
    aList.add(12);
    System.out.println(aList);
    System.out.println(aList.size());
    System.out.println(aList.get(0));
    System.out.println(aList.remove(2));
    System.out.println(aList);
    aList.add(1, 11);
    System.out.println(aList);
    System.out.println(aList.contains(111));
    */

    /*
     * LinkedList
     
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    ll.addFirst(3);
    System.out.println(ll);
    System.out.println(ll.removeFirst());
    System.out.println(ll.removeLast());
    System.out.println(ll);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
    System.out.println(ll.size());
    System.out.println(ll); 
    System.out.println(ll.contains(2));
    */

    /*
     * Stack
     
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    System.out.println(st.peek());
    st.pop();
    System.out.println(st);
    System.out.println(st.size());
    System.out.println(st.empty());
    */

    /*
     * Vector similar to ArrayList
     
    Vector<Integer>vect = new Vector<>();
    vect.add(10);
    vect.add(0, 11);
    System.out.println(vect);
    System.out.println(vect.size());
    System.out.println(vect.remove(0));
    System.out.println(vect);
    */

    /* 
     * HashSet
     * DS That Stores Unique Elements in random order
     
    HashSet<Integer>hs = new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(1);
    hs.add(3);
    hs.add(0);
    hs.add(5);
    System.out.println(hs);
    System.out.println(hs.remove(5));
    System.out.println(hs.size());
    System.out.println(hs.isEmpty());
    System.out.println(hs);
    for(var i:hs){
      System.out.println(i);
    }
    */

    /*
     * DS That stores unique elements in sorted order
     
    TreeSet<Integer>ts = new TreeSet<>();
    ts.add(1);
    ts.add(9);
    ts.add(4);
    ts.add(12);
    System.out.println(ts);
    System.out.println(ts.floor(8)); //  first <= 8
    System.out.println(ts.ceiling(8)); // first >= 8
    */

    /* 
     * ArrayDeque
     
    ArrayDeque<Integer>ad = new ArrayDeque<>();
    ad.offer(2);
    ad.offer(3);
    ad.offer(6);
    ad.offer(8);
    System.out.println(ad);
    System.out.println(ad.poll());
    System.out.println(ad.peek());
    System.out.println(ad.size());
    */

    /* 
     * Gives you smallest element in peek 

    PriorityQueue<Integer>pq = new PriorityQueue<>();
    pq.offer(1);
    pq.offer(0);
    pq.offer(2);
    pq.offer(5);
    pq.offer(3);
    System.out.println(pq);
    pq.poll();
    System.out.println(pq.peek());
    System.out.println(pq.size());
    while(!pq.isEmpty()){
      System.out.println(pq.peek());
      pq.poll();
    }
    */
    
    /*
     * Does not stores the keys in sorted order
     
    HashMap<Integer,String> mp = new HashMap<>();
    mp.put(1, "Aman");
    mp.put(2, "Shiva");
    mp.put(3, "Shivam");
    System.out.println(mp);
    System.out.println(mp.get(1));
    System.out.println(mp.size());
    */

    /*
     * Stores Keys in Sorted Order
     
    TreeMap<Integer,String> mp = new TreeMap<>();
    mp.put(1, "Aman");
    mp.put(2, "Shiva");
    mp.put(3, "Shivam");
    mp.put(6, "Shivam");
    mp.put(12, "Shivam");

    System.out.println(mp);
    System.out.println(mp.get(1));
    System.out.println(mp.size());
    System.out.println(mp.floorKey(7));
    System.out.println(mp.ceilingKey(7));
    Set<Integer>s = mp.keySet();
    System.out.println(s);
    */

    /*
     * Common Algorithms
     
    ArrayList<Integer>al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(4);
    al.add(3);
    al.add(6);

    Collections.sort(al);
    System.out.println(al);
    System.out.println(Collections.min((al)));
    System.out.println(Collections.max((al)));
    Collections.reverse(al);
    System.out.println(al);
    System.out.println(Collections.frequency(al, 3));
    int num = (int) Math.pow(2,5);
    System.out.println(num);
    */
    /*
     * Iterator
    
    Iterator<Integer> iterator = al.iterator();
    while(iterator.hasNext()){
      Integer num = iterator.next();
      System.out.println(num);
    }
    */

    ArrayList<Integer> al = new ArrayList<>();
    al.add(5);
    al.add(3);
    al.add(1);
    al.add(2);
    al.add(4);
    Collections.sort(al, getComparator());

    System.out.println(al);
    sc.close();
  }
}

/* 
  Custom Classes 

class Data{
  private int num;
  private String  name;

  Data(Integer _num, String _name){
    this.num = _num;
    this.name = _name;
  }
  public void setNum(Integer _num){
    this.num = _num;
  }
  public void setName(String _name){
    this.name = _name;
  }

  public Integer getNum(){
    return num;
  }
  public String getName(){
    return name;
  }
}
*/