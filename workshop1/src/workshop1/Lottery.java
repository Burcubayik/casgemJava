package workshop1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
	public ArrayList<ArrayList<Integer>> play(){
	ArrayList<Integer> tempNumbers=new ArrayList<Integer>();
		

		Scanner input = new Scanner(System.in);

		Random rnd = new Random();
	
			System.out.println("Oynamak istediğiniz kupon sayısını giriniz: ");
			int columnLength = input.nextInt();
			
			if(columnLength<=8) {
				ArrayList<ArrayList<Integer>> column=new ArrayList<ArrayList<Integer>>(columnLength);
				for(int i=0;i<columnLength;i++) {
					ArrayList<Integer> column1=new ArrayList<Integer>();
					while(column1.size()<6) {
						int number=rnd.nextInt(1,50);
						
						if(!tempNumbers.contains(number)) {
							tempNumbers.add(number);
							column1.add(number);
						}
					
					}


					column.add(column1);
				}

				for(int i=0;i<column.size();i++) {
					for(int j=0;j<column.get(i).size();j++) {
						System.out.print(column.get(i).get(j)+" ");

					}
					System.out.println();
				}
				return column;
				}
			
				else {
					System.out.println("En fazla 8 kupon oynayabilirsiniz");
					return play();
				}
				
	}
}



