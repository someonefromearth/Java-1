/**
* Homework. Java 1. Lesson 3.
*
*@author Vasily Kozlikin
*@version midnight 20 August 2018
*
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
 
// 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
// угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем
//число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще
//раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

public class HW_ThirdLesson_part1 {
	public static void main (String[] args) {
	    int rightNumber;
		int count = 1;
		int userChoice;
		int oneMoreTime;
	    Random r = new Random();
	    rightNumber = r.nextInt(10);
		do {
	        System.out.println("Input number from 1 to 10");
	        Scanner scan = new Scanner(System.in);
	        userChoice = scan.nextInt();
	        checkNumber(userChoice, rightNumber);
			System.out.println("Type 1, if you want to play one more time, or 0, if you don't");
			oneMoreTime = scan.nextInt();
			if (oneMoreTime==0)
				break;
	    } while (oneMoreTime==1 && ++count<=3);
	    System.out.println("Right number was: " + rightNumber);
	    if (count==4) System.out.println("You can't try anymore.");
		System.out.println("Thans for game!");
	}
	
	public static void checkNumber(int userChoice,int rightNumber){
		if (userChoice == rightNumber) System.out.println("Congratulations!This is the right number!");
		else {
			System.out.println("Oops,this is not a right number...");
		    if (userChoice > rightNumber) System.out.println("Your number is bigger");
				else System.out.println("Your number is lesser");
	    }
		
	}