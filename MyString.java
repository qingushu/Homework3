import java.util.Scanner;
import java.util.Arrays;

public final class MyString{
	private final char[] chars;
	private int size;
	
	
	public MyString(char c[]){
		size = c.length;
		chars = new char[size];
		System.arraycopy(c, 0, chars, 0, size);	
			
	}		

	public char charAt(int index){
		return chars[index];
	}

	public int length(){
		return size;
	}
	
	public MyString toLowerCase(){
		for(int i = 0; i < size; i++)
			if(chars[i] >= 65 && chars[i] <= 90)
				chars[i] += 32;
		return this;
	}
	
	public MyString toUpperCase(){
		for(int i = 0; i < size; i++)
			if(chars[i] >= 97 && chars[i] <= 122)
				chars[i] -= 32;
		return this;
	}
	
	public MyString getMyString(){
		return new MyString(chars);
	}

	public boolean equals(MyString s){
		if(this.length() != s.length())
			return false;

		for(int i = 0; i < this.length(); i++)
			if(this.charAt(i) != s.charAt(i))							return false;
		return true;
	}

	public MyString substring(int begin, int end){
		return new MyString(Arrays.copyOfRange(chars, begin, end));
		
	}
	public String toString(){
		return new String(chars);	
	}

	public static MyString valueOf(int number){	
		char[] arr = new char[(int)(Math.log10(number) +1)];

		for (int i = arr.length - 1; i >= 0; i--) {
    			arr[i] = (char) ('0' + (number % 10));
    				number /= 10;
		}
		return new MyString(arr);
	}

	

public static void main(String args[]){
	char[] c = {'a', 'b', 'c', 'd'};
	MyString s = new MyString(c);
	System.out.println(s);	
	System.out.println(s.charAt(3));
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.getMyString());
	char[] c1 = {'c', 'd'};
	MyString s1 = new MyString(c1);
	char[] c2 = {'a', 'b', 'c', 'd'};
	MyString s3 = new MyString(c2);
	System.out.println(s.equals(s1));
	System.out.println(s.equals(s3));
	System.out.println(s.substring(0,2));
	System.out.println(s.toString());
	System.out.println(s.valueOf(118887777));
}

}
