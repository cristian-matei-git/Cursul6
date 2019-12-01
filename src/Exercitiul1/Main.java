package Exercitiul1;

public class Main {

	public static void main(String[] args) {
		
		MyIntArrayList numbers = new MyIntArrayList(6);
		numbers.add(2);
		numbers.add(0, 2);
		
		numbers.add(3);
		
		numbers.size();
		
		//System.out.println(numbers.contains(1));
		//System.out.println(numbers.get(0));
		System.out.println(numbers.indexOf(2));
		//System.out.println(numbers.lastIndexOf(2));
		//numbers.remove(0);
		
		//numbers.remove(0);
		
		numbers.set(0, 5);
		
		for(int i = 0; i < numbers.size(); i++) {
			
			System.out.println(numbers.elements[i] + " ");
			
		}
		
		numbers.clear();
		
		
	}

}
