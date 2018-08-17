/**
* Homework. Java 1. Lesson 2.
*
*@author Vasily Kozlikin
*@version 17 August 2018
*
*/

import java.util.Arrays;
 
public class HomeworkSecondLesson {
	public static void main (String[] args) {
		reverseArr();
	    fillArr();
		multiplyArr();
	    fillDiagonalArr(4);
		findMinMaxArr(1,5,2,9,11,0);
		int[] arrayBal={5,6,1,2,8};
		System.out.println("Task 6 \n"+ "Source array: " + Arrays.toString(arrayBal));
		System.out.println("Return: " + checkBalance(arrayBal));
		System.out.println("Task 7 \n");
		int[] arrShift={1,2,3,4,5,6};
		shiftArr(3,arrShift);
		
	}
 
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Напри-
		//мер: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия за-
		//менить 0 на 1, 1 на 0;
		
		public static void reverseArr() {
			//Метод создает массив и заполняет его целыми числами, затем меняет
			//0 на 1, а
			int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
			System.out.println("Task 1 \n" +  "Source array: " + Arrays.toString(arr));
			for(int i=0; i < arr.length;i++) {
				if (arr[i]==0)
				arr[i]=1;
				else
					arr[i]=0;
			}
			System.out.println("Modified array: " + Arrays.toString(arr));
		}
		
		// 2. Задать пустой целочисленный массив размером 8. С помощью цикла за-
		//полнить его значениями 0 3 6 9 12 15 18 21;
		
		public static void fillArr(){
			int[] arr=new int[8];
			System.out.println("Task 2 \n" + "New array: " + Arrays.toString(arr));
			for(int i=1;i<arr.length;i++){
				arr[i]=arr[i-1]+3;
			}
			System.out.println("Modified array: " + Arrays.toString(arr));
		}
		
		// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по 
		//нему циклом, и числа меньшие 6 умножить на 2;
		
		public static void multiplyArr(){
			int[] arr={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
			System.out.println("Task 3 \n" + "Source array: " + Arrays.toString(arr));
			for(int i=0;i<arr.length;i++){
				if (arr[i]<6)
					arr[i]*=2;
			}
			System.out.println("Modified array: " + Arrays.toString(arr));
		}
		
		// 4. Создать квадратный двумерный целочисленный массив (количество 
		//строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его 
		//диагональные элементы единицами;

        public static void fillDiagonalArr(int a){
            System.out.println("Task 4 \n" + "Source matrix: ");
            //Show matrix
            int[][] arr=new int[a][a];
				for(int i=0;i<arr.length;i++){
			    for(int j=0;j<arr[0].length;j++){
			        System.out.print(arr[i][j] +" ");
			    }
			    System.out.println();
			    }
            for(int i=0;i<arr.length;i++){
			    for(int j=0;j<arr[0].length;j++){
			        if (i==j||(i+j)==(arr.length-1))
			        arr[i][j]=1;
			    }
            }
            //Show new matrix
			System.out.println("Modified matrix:");
            for(int i=0;i<arr.length;i++){
			    for(int j=0;j<arr[0].length;j++){
			        System.out.print(arr[i][j] +" ");
			    }
			    System.out.println();
			    }
        }
		
		// 5. ** Задать одномерный массив и найти в нем минимальный и макси-
		//мальный элементы (без помощи интернета);
		
        public static void findMinMaxArr(int a,int b,int c,int d,int e,int f){
	        int min=a;
	        int max=a;
	        int[] arr={a,b,c,d,e,f};
	        System.out.println("Task 5 \n" + "Source array: "+Arrays.toString(arr));
	        for(int i=0;i<arr.length;i++){
		        if (arr[i]>max)
			        max=arr[i];
		        if (arr[i]<min)
			        min=arr[i];
	        }
	        System.out.println("Maximum number is: "+max);
	        System.out.println("Minimum number is: "+min);
        }
		
		// 6. ** Написать метод, в который передается не пустой одномерный це-
		//лочисленный массив, метод должен вернуть true если в массиве есть ме-
		//сто, в котором сумма левой и правой части массива равны.
		//Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
		//checkBalance ([2, 1, 1, 2, 1]) → false,
		//checkBalance ([10, || 10]) → true, граница показана символами ||, эти
		//символы в массив не входят.
		
		public static boolean checkBalance(int[] arrayBal){
			int leftSum=0;
			int rightSum=0;
			for(int i=0;i<arrayBal.length;i++){
				leftSum+=arrayBal[i];
				rightSum=0;
				for(int j=i+1;j<arrayBal.length;j++){
					rightSum+=arrayBal[j];
				}
				if (leftSum==rightSum){
                System.out.println("Left side = " + leftSum + " before possition [" + (i + 1) + "] and Right side = " + rightSum + " from possition[" + (i + 1) + "]");
                break;
				}
			}
			return (leftSum == rightSum) ? true : false;
		}
		
		// 7.**** Написать метод, которому на вход подается одномерный массив и
        //число n (может быть положительным, или отрицательным), при этом метод
		//должен сместить все элементымассива на n позиций. Для усложнения зада-
		//чи нельзя пользоваться вспомогательными массивами.
		//Удалось реализовать только циклический сдвиг с положительным n, на вы-
		//ходных сделаю и с отрицательным, не хватило времени..:-(
		public static void shiftArr(int n, int[] arrShift){
			
			System.out.println(Arrays.toString(arrShift));
			int pred=arrShift[0];
			int tmp=0;
			for(int i=0;i<n;i++){
				for (int j=0;j<arrShift.length;j++){
					if (j!=arrShift.length-1){
					tmp=arrShift[j+1];
					arrShift[j+1]=pred;
					pred=tmp;
					}
					else arrShift[0]=pred;
				}
			}
			System.out.println(Arrays.toString(arrShift));
		}
				
					
					
	
	

}