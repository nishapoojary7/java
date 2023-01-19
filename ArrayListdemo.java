package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method
		ArrayList<String>obj=new ArrayList<String>();
		Scanner d=new Scanner(System.in);
		int c,ch;
		int i,j;
		String str,str1;
		do
		{
			System.out.println("string manipulation");
			System.out.println("* * * * * ");
			System.out.println("1. append at end \n 2. insert at particular index \n 3.search");
			System.out.println("4. list string that starting  with letter");
			System.out.println("5.size \n 6. remove \n 7.sort \n 8. display \n");
			System.out.println("enter your choice");
			c=d.nextInt();
			switch(c)
			{
			case 1: {
				System.out.println("enter the string");
				str=d.next();
				obj.add(str);
				break;
			}
			case 2: {
				System.out.println("enter the string");
				str=d.next();
				System.out.println("specify tne index position to input");
				i=d.nextInt();
				obj.add(i-1,str);
				System.out.println("the array list has the following element"+obj);
				break;
			}
			case 3: {
				System.out.println("enter the string to search");
				str=d.next();
				j=obj.indexOf(str);
				if(j==-1)
				System.out.println("element not found!!");
				else
					System.out.println("index of"+str+"is"+j);
				break;
			}
				case 4: {
					System.out.println("enter tge character to list string starts with specified character");
					str=d.next();
					for(i=0;i<(obj.size()-1);i++) {
						str1=obj.get(i);
						if(str1.startsWith(str1)) {
							System.out.println(str1);
							
						}	
						}
					break;
					}
				case 5: {
					System.out.println("size of the list"+obj.size());
					break;
				}
					case 6: {
						System.out.println("enter the element to be remove");
						str=d.next();
						if(obj.remove(str)) {
							System.out.println("element removed"+str);
						} else {
							System.out.println("rlement not present1!!");
						}
						break;
					}
					case 7: {
						Collections.sort(obj);
						System.out.println("the array list has the following elementst"+obj);
						break;
					}
					case 8:{
						System.out.println("the array list has the following elements"+obj);
						break;
					}
			}
			System.out.println(" enter 0 t0 break and 1 to continue");
			ch=d.nextInt();
		}while(ch==1); 
	}
	}

					
				
		