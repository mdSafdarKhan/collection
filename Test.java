package collection;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        traverseArrayList();
        listToArray();
        traverseHashSet();
        checkIfElementIsAvailableInArrayList();
        checkIfElementIsAvailableInHashSet();
        arrayToList();
        iterateHashMap();
        sortHashMapByKey();
        sortArrayListWithComparableAndComparator();
        sortArrayListInDescOrder();
        addElementOnIndexInArrayList();
        linkedListToArrayList();
        hashSetToArray();
        reverseArrayList();
        iterateTreeMap();
        sortHashMapByValue();
        serializeHashMap();
        synchronizedHashMap();
        serializeArrayList();
        synchronizedArrayList();
    }

    public static void traverseArrayList(){
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");

        for(String s: al){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void listToArray(){
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("lmn");
        al.add("xyz");

        Object[] arr = al.toArray();

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void traverseHashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("1000");
        set.add("2000");
        set.add("3000");

        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void checkIfElementIsAvailableInArrayList(){
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");

        if(al.contains("z")){
            System.out.println(al + " has " + "z");
        }
        else{
            System.out.println(al + " don't have " + "z");
        }
    }

    public static void checkIfElementIsAvailableInHashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("1000");
        set.add("2000");
        set.add("3000");

        if(set.contains("2000")){
            System.out.println(set + " has " + "2000");
        }
        else{
            System.out.println(set + " don't have " + "2000");
        }
    }

    public static void arrayToList(){
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr){
            al.add(i);
        }
        System.out.println(al.toString());
    }

    public static void iterateHashMap(){
        HashMap<String, String> hm = new HashMap<>();
        hm.put("A", "Apple");
        hm.put("B", "Ball");
        hm.put("C", "Cat");

        for(Map.Entry<String, String> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " for " + entry.getValue());
        }
    }

    public static void sortHashMapByKey(){
        HashMap<Integer, String> hm = new HashMap<>();

//        Student s1 = new Student(1002, 20, "Alice");
//        Student s2 = new Student(1002, 20, "Bob");
//        Student s3 = new Student(1001, 30, "Sam");
//        Student s4 = new Student(1003, 15, "Pete");

        hm.put(21212, "one");
        hm.put(222212, "three");
        hm.put(1111, "two");
        hm.put(33121, "four");

        System.out.println("======= Before sorting hashmap ========");
        for(Map.Entry<Integer, String> entry: hm.entrySet()){
            System.out.println(entry.getKey());
        }

        System.out.println("======= After sorting hashmap ========");
        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        for(Map.Entry<Integer, String> entry: tm.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    public static void sortArrayListWithComparableAndComparator(){
        ArrayList<Student> al = new ArrayList<>();

        Student s1 = new Student(1002, 20, "Alice");
        Student s2 = new Student(1002, 20, "Bob");
        Student s3 = new Student(1001, 30, "Sam");
        Student s4 = new Student(1003, 15, "Pete");

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        System.out.println("======== Sorting ArrayList based on Comparable (default by id)=========");
        Collections.sort(al);
        for(Student s: al){
            System.out.println(s);
        }

        System.out.println("======== Sorting ArrayList based on Comparator (by age) =========");
        Collections.sort(al, new StudentAgeComparator());
        for(Student s: al){
            System.out.println(s);
        }
    }

    public static void sortArrayListInDescOrder(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1000);
        al.add(500);
        al.add(2000);
        al.add(1500);
        al.add(750);

        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }

    public static void addElementOnIndexInArrayList(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1000);
        al.add(500);
        al.add(2000);
        al.add(1500);
        al.add(750);
        System.out.println(al);

        al.add(2, 1100);
        al.add(4, 8000);
        System.out.println(al);
    }

    public static void linkedListToArrayList(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Elephant");
        ll.add("Apple");
        ll.add("Cat");
        ll.add("Dog");
        ll.add("Ball");

        System.out.println(ll);

        ArrayList<String> al = new ArrayList<>(ll);
        System.out.println(al);
    }

    public static void hashSetToArray(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1111);
        hs.add(2222);
        hs.add(1002);
        hs.add(2211);
        System.out.println(hs);

        Object[] obj = hs.toArray();
            System.out.println(obj[2]);
    }

    public static void reverseArrayList(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1000);
        al.add(500);
        al.add(2000);
        al.add(1500);
        al.add(750);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }

    public static void iterateTreeMap(){
        TreeMap<String, String> hm = new TreeMap<>();
        hm.put("A", "Apple");
        hm.put("B", "Ball");
        hm.put("C", "Cat");

        for(Map.Entry<String, String> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " for " + entry.getValue());
        }
    }

    public static void sortHashMapByValue(){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("lkndkcns", 3000);
        hm.put("ksnmdvknsv", 1000);
        hm.put("smvk", 4000);
        hm.put("plpklf", 2000);

        System.out.println(hm);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new MapEntryValueComparator());
        System.out.println(list);

        LinkedHashMap<String, Integer> sortedHmByValues = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry: list){
            sortedHmByValues.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedHmByValues);
    }

    public static void serializeHashMap(){
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Value1");
        hashmap.put(2, "Value2");
        hashmap.put(3, "Value3");
        hashmap.put(4, "Value4");
        hashmap.put(5, "Value5");

        try{
            File file = new File("hashmap.ser");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashmap);
            oos.close();
            fos.close();

            System.out.println("======== HashMap serialized ========");

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashMap<Integer, String> deserializedHashMap = (HashMap<Integer, String>)ois.readObject();
            ois.close();
            fis.close();

            System.out.println(deserializedHashMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void synchronizedHashMap(){
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Value1");
        hashmap.put(2, "Value2");
        hashmap.put(3, "Value3");
        hashmap.put(4, "Value4");
        hashmap.put(5, "Value5");

        System.out.println(hashmap);

        Map sHashMap = Collections.synchronizedMap(hashmap);
        System.out.println(sHashMap);
    }

    public static void serializeArrayList(){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Boston");
        al.add("Dallas");
        al.add("New York");

        try{
            File file = new File("ArrayListSerialized.ser");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            System.out.println("======== array list serialized =======");

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> sal = (ArrayList<String>)ois.readObject();
            ois.close();
            fis.close();

            System.out.println(sal);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void synchronizedArrayList(){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Boston");
        al.add("Dallas");
        al.add("New York");

        System.out.println(al);

        List<String> sal = Collections.synchronizedList(al);

        System.out.println(sal);
    }
}

class Student implements Comparable{
    private int id;
    private int age;
    private String name;

    Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(Object obj) {

        if(obj instanceof Student){
            Student ref = (Student) obj;
            if(this.id == ref.id){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return id;
    }*/

    @Override
    public int compareTo(Object obj) {
        Student ref = (Student) obj;
        if(this.id == ref.id){
            return 0;
        }
        else if(this.id > ref.id){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class StudentAgeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s1.getAge() > s2.getAge())
            return 1;
        else if(s1.getAge() < s2.getAge())
            return -1;
        else
            return 0;
    }
}

class MapEntryValueComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry<String, Integer> e1 = (Map.Entry<String, Integer>) o1;
        Map.Entry<String, Integer> e2 = (Map.Entry<String, Integer>) o2;
        return e1.getValue().compareTo(e2.getValue());
    }
}
