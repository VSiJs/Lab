package Lab6_1;

import java.util.Arrays;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	private void growSize() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return elements[i];
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		E replacedElement = elements[i];
		elements[i] = e;
		return replacedElement;
	}

	public boolean add(E e) {
		if (size == elements.length) {
			growSize();
		}
		elements[size] = e;
		size++;
		return true;
	}

	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		if (size == elements.length) {
			growSize();
		}
		for (int j = size; j > i; j--) {
			elements[j] = elements[j - 1];
		}
		elements[i] = e;
		size++;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		E removedElement = elements[i];
		for (int j = i; j < size - 1; j++) {
			elements[j] = elements[j + 1];
		}
		elements[size - 1] = null;
		size--;
		return removedElement;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}

	public int lastIndexOf(Object o) {
		for (int i = size - 1; i >= 0; i--) {
			if (o == null ? elements[i] == null : o.equals(elements[i])) {
				return i;
			}
		}
		return -1;
	}

	public Object[] toArray() {
		return Arrays.copyOf(elements, size);
	}
}
