package test;

import java.util.Scanner;


public class Test {
	
	
	

	

	    public static void integerToRoman(int num) {
	    	
	    	
	        System.out.println("Integer: " + num);
	        int[] values = {100,90,50,40,10,9,5,4,1};
	        String[] romanLiterals = {"C","XC","L","XL","X","IX","V","IV","I"};

	        StringBuilder roman = new StringBuilder();

	        for(int i=0;i<values.length;i++) {
	            while(num >= values[i]) {
	                num -= values[i];
	                roman.append(romanLiterals[i]);
	             
	                
	            }
	        }
	        
	        System.out.println("Roman: " + roman.toString());
	        System.out.println("---------------------------------------------------");
	    }

	    public static void main(String[] args) {
	    	 
	    	Scanner reader = new Scanner(System.in);
	    	
	    
	    
	    	
	    	 
			    System.out.print("Введите два целых числа через пробел: ");
			    int a = reader.nextInt();
		    	int b = reader.nextInt();
		    	
		    	
			   
		    	System.out.print("Выберите действие (+, -, *, /): ");
			   
				char operator = reader.next().charAt(0);
				int result;

				switch (operator) {
			      case '+':
			        result = a + b;
			        break;

			      case '-':
			        result = a - b;
			        break;

			      case '*':
			        result = a * b;
			        break;

			      case '/':
			        result = a / b;
			        break;

			      // operator doesn't match any case constant (+, -, *, /)
			      default:
			        System.out.printf("Не верный ввод!");
			        return;
			    }
	    	
	    	
	        integerToRoman(result);
	        /*integerToRoman(1023);
	        integerToRoman(542);*/
	    }
	}


