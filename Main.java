package Lab6_2;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println("Size: " + list.size());
        System.out.println("First: " + list.first());
        System.out.println("Last: " + list.last());

        int removedFirst = list.removeFirst();
        System.out.println("Removed First: " + removedFirst);

        int removedLast = list.removeLast();
        System.out.println("Removed Last: " + removedLast);
    }
}
