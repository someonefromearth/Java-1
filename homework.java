/**
* Homework. Java 1. Lesson 1.
*
*@author Vasily Kozlikin
*@version 12 August 2018
*
*/

class HomeworkFirstLesson {
	public static void main (String[] args) {
	System.out.println("The result should be 3: " + calcResult(1,2,4,4)); // Проверка: 1 * (2 + (4 / 4)) = 3
	System.out.println("The result should be true: " + checkSum(8, 9)); // Проверка: должно быть true
	System.out.println("The result should be false: " + checkSum(1, 2)); // Проверка: должно быть false
	positiveOrNegative(0); // Проверка: положительное
	positiveOrNegative(-1); // Проверка: отрицательное
	System.out.println("The result should be true: " + checkNegativity(-3)); // Проверка: должно быть true
	printHello("Vasily"); // Проверка: должно быть "Hello, Vasily!"
	checkYear(400); // Високосный
	checkYear(100); // Не високосный
	checkYear(800); // Високосный
	checkYear(1533); // Не високосный
	}
	
	static void initVar() {
	// создаем переменные всех пройденных типов
	int a;
	byte b;
	short c;
	long d;
	float e;
	double f;
	char	g;
	boolean h;
	}
	
	static int calcResult(int a, int b, int c, int d) {
		// Метод вычисляет результат заданного выражения и возвращает результат в return
		// Переменные целочисленные
		return a * (b + (c / d));
	}
	
	static boolean checkSum(int a, int b) {
		// Метод проверяет, лежит ли сумма чисел в пределах от 10 до 20 и возвращает true или false
		if ((a + b) >= 10 && (a + b) <= 20)
			return true;
		else
			return false;
	}
	
	static void positiveOrNegative(int a) {
		// Метод проверяет целое число на положительное/отрицательное
		if (a >= 0)
			System.out.println(a+" is positive.");
		else
			System.out.println(a+" is negative.");
	}
	
	static boolean checkNegativity(int a) {
		// Метод возвращает true, если число отрицательное
		if (a < 0)
			return true;
		else
			return false;
	}
	
	static void printHello(String s) {
		// Метод выводит сообщение "Привет, указанное_имя!"
		System.out.println("Hello, " + s + "!");
	}
	
	static void checkYear(int a) {
		// Метод проверяет год на "високосность"
		if ((a % 400) == 0)
			System.out.println(a+" is a leap-year");
		else if ((a % 100) == 0)
			System.out.println(a+" isnt a leap-year");
		else if ((a % 4) == 0)
			System.out.println(a+" is a leap-year");
		else
			System.out.println(a+" isnt a leap-year");
	}
	
}