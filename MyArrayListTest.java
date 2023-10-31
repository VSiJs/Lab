package Lab6_1;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, 10);
        System.out.println("Modified element at index 1: " + list.get(1));

        list.add(1, 5);
        System.out.println("Added 5 at index 1: " + list.get(1));

        int removed = list.remove(2);
        System.out.println("Removed element at index 2: " + removed);

        System.out.println("Size after removal: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
