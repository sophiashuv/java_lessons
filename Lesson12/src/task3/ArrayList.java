package task3;

import java.util.Arrays;

public class ArrayList<E> {
	private int size;
	private E[] data;
	private int counter = 0;
	
	public ArrayList() {
		size = 0;
		data = (E[])new Object[size];
		}

	public ArrayList(int _size) {
		size = _size;
		data = (E[])new Object[size];
		}
	
	public void add(E value) {
		if (counter < data.length) {
			data[counter] = value;
			counter++;
		} else {
			size++;
			E[] extendedArr = (E[]) new Object[size];
			System.arraycopy(data, 0, extendedArr, 0, data.length);
			data = extendedArr;
			data[counter] = value;
			counter++;
			}
		}
	
	public void add(E value, int index) {
		if (data.length <= index) {
			while (data.length != index-1) add(null);
			add(value);
		} else data[index] = value;
		}
	
	public void remove(int index) { 
		try {
			E[] extendedArr = (E[]) new Object[size-1];
			for(int i = 0; i < index; i++) {extendedArr[i] = data[i];}
			for(int i = index; i < size - 1; i++) {extendedArr[i] = data[i+1];}
			System.arraycopy(extendedArr, 0, data, 0, data.length-1);
			data = extendedArr;
			size--;
			counter--;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			}	
		}
	
	public int getSize() {
		return size;
		}
	
	@Override
	public String toString() {
		return  Arrays.toString(data) + ", [size=" + size + "]";
		}
}
