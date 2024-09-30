package vydrenkova.internship;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list); // [A, B, C]

        list.remove(1);
        System.out.println(list); // [A, C]

        list.addAll(java.util.Arrays.asList("D", "E", "F"));
        System.out.println(list); // [A, C, D, E, F]

        System.out.println(list.get(2)); // D

        System.out.println(list.isEmpty()); // false

        list.clear();
        System.out.println(list.isEmpty()); //true

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(5);
        list2.add(3);
        list2.add(8);
        list2.add(1);
        list2.add(2);

        System.out.println("Before sorting: " + list2); // [5, 3, 8, 1, 2]

        list2.sort();

        System.out.println("After sorting: " + list2); // [1, 2, 3, 5, 8]
    }
}
