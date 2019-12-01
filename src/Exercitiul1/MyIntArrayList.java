package Exercitiul1;
import java.util.Arrays;


	public class MyIntArrayList {
	 
		public int[] elements;
		private int size;
		 
		public MyIntArrayList(int initialCapacity) {
	  		this.elements = new int[initialCapacity];
	  	}
		
	  	public MyIntArrayList() {
	  		this(10);
	  	}
	  	
	  	public MyIntArrayList(MyIntArrayList c) {
	  		this.elements = c.elements;
	  	}
	 
	  	public void add(int index, int element) {
	  		if (index < 0 || index >= this.size) {
	  			// should throw IndexOutOfBoundsException
	  			System.out.println("Throwing IndexOutOfBoundsException when trying to" +
	                     " add element at position " + index);
	  		}else {
	  			int[] tmp = Arrays.copyOf(this.elements, this.size+1);
	  			for(int i = 0; i <= index; i++) {
	  			
	  				tmp[i] = elements[i];
	  				if(i == index) {
	  					tmp[i+1] = element;
	  				}
	  				
	  				
	  			}
	  			for(int i = index + 2; i < size+1; i++) {
	  				tmp[i] = elements[i-1];
	  			}
	  			this.elements = tmp;
	  		}
	  	}
	  	
	 
	  	public boolean add(int element) {
	  		if (this.size == this.elements.length) {
	  			this.elements = Arrays.copyOf(this.elements, this.size * 2);
	  		}
	 
	  		this.elements[size] = element;
	  		this.size++;
	 
	  		return true;
	  	}
	 
	  	public int size() {
	  		return this.size;
	  	}
	 
	  	public int indexOf(int e) {
	  		for (int i=0; i<this.size; i++) {
	  			if (this.elements[i] == e) {
	  				return i;
	  			}
	  		}
	  		return -1;
	  	}
	 
	  	public int removeElementAtIndex(int index) {
	  		if (index < 0 || index >= this.size) {
	  			// should throw IndexOutOfBoundsException
	  			System.out.println("Throwing IndexOutOfBoundsException when trying to" +
	                     " remove element at position " + index);
	  			return -1;
	  		}
	 
	  		int removedElement = this.elements[index];
	  		for (int i=index; i<this.size; i++) {
	  			this.elements[i] = this.elements[i+1];
	  		}
	  		this.size--;
	 
	  		return removedElement;
	  	}
	 
	  	public void clear() {
	  		this.size = 0;
	  	}
	 
	  	public int set(int index, int e) {
	  		if (index < 0 || index >= this.size) {
	  			// should throw IndexOutOfBoundsException
	  			System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
	                     " the element " + e + " at position " + index);
	  			return -1;
	  		}
	 
	    int replacedElement = this.elements[index];
	    this.elements[index] = e;
	    return replacedElement;
	    
	  	}
}