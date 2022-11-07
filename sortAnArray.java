package com.haktanozgur.sortAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class sortAnArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin boyutunu giriniz : "); 
		int lenght = scanner.nextInt();
		
		int array[] = new int[lenght];  

		
		for (int i = 0; i < array.length; i++) {  // for döngüsü kullanarak kullanıcının yazacağı sayılar, oluşturalan array içerisine yazıldı
			System.out.println((i + 1) + ". Elemanı : " ); 
            array[i] = scanner.nextInt();       
        }
		
		Arrays.sort(array); 
		System.out.println("Sıralama : " + Arrays.toString(array)); 
		//Arrays sınıfının metodlarını kullanarak önce dizideki elemanlar sıralanır ardından ekrana yazdırılır.
		
		
	}
		
}
