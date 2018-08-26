/**
* Homework. Java 1. Lesson 5.
*
*@author Vasily Kozlikin
*@version midnight 27 August 2018
*
*/

import java.util.Arrays;

public class HomeworkJ1L5{
	public static void main(String[] args){
		Worker[] workerArray = new Worker[5];
		workerArray[0] = new Worker("Ivanov Ivan","Engineer","i.ivan@mail.ru",
		"89151234567","100000",30);
		workerArray[1] = new Worker("Petrov Petr","Engineer","p.petr@mail.ru",
		"89161234567","200000",45);
		workerArray[2] = new Worker("Sidorov Sidorov","Engineer","s.sidor@mail",
		"89171234567","300000",22);
		workerArray[3] = new Worker("Kuznecov Kuznec","Engineer","k.kuznec@mail.ru",
		"89181234567","400000",64);
		workerArray[4] = new Worker("Semenov Semen","Engineer","s.semen@mail.ru",
		"89191234567","500000",53);
		for(int i = 0; i < 5; i++ ){
		    if(workerArray[i].age>40)
//	        Worker.showInfo(workerArray[i]);
		    System.out.println("Name: " + workerArray[i].name + "\n" + "Position: " +
			workerArray[i].position  + "\n" + "E-mail: " + workerArray[i].email  +
			"\n" + "Phone number: " + workerArray[i].phoneNumber  + "\n" +
			"Salary: " + workerArray[i].salary  + "\n" + "Age: " +
			workerArray[i].age + "\n");
		}
	}
}
	
class Worker {
	String name;
	String position;
	String email;
	String phoneNumber;
	String salary;
	int age;
	
	Worker(String name,String position, String email, String phoneNumber,String salary,int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}
	/* непонял, как это сделать...(
	
	public void showInfo(Worker workerArray){
		System.out.println("Name: " + workerArray.name + "\n" + "Position: " +
		workerArray.position  + "\n" + "E-mail: " + workerArray.email  + "\n" +
		"Phone number: " + Worker.phoneNumber  + "\n" + "Salary: " +
		workerArray.salary  + "\n" + "Age: " + workerArray.age + "\n");
	} */

}


	
	