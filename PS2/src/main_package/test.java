package main_package;

public class test {
	static void main(String[] args){
	
    MyInteger four = new MyInteger(4);
	
	MyInteger seventeen = new MyInteger(17);
	
	boolean test1=four.isEven();
	
	boolean test2=seventeen.isEven();
	
    boolean test3=four.isOdd();
	
	boolean test4=seventeen.isOdd();
	
    boolean test5=four.isPrime();
	
	boolean test6=seventeen.isPrime();
	
	int test7=seventeen.GetInteger();
	
	int test8=four.parseInt("1");
	
	char[] array = {1,2,3};
	
	int test9=four.parseInt(array);
	
	System.out.print(Boolean.toString(test1) +Boolean.toString(test2) +Boolean.toString(test3) 
			+Boolean.toString(test4) +Boolean.toString(test5) +Boolean.toString(test6) 
			+Integer.toString(test7) +Integer.toString(test8) +Integer.toString(test9));
	
	}
	}


