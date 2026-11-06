

public class SortingAlgDriver{
	public static void main(String[] args){
		//creating a random array list of number 1 - 1000
		int amount = 5;
		int[] arrayList = new int[amount];
		arrayList = randomNumber(amount);
		System.out.print(arrayList.toString());


	}

	public static int[] randomNumber(int amount){
		int[] arrayList = new int[amount];

		for(int x = 0; x == arrayList.length; x++){
			arrayList[x] = (int) (Math.random() * 1000) + 1;
		}
		return arrayList;
	}

	public static void arrayListPrint(int arrayList[]){
		for(int x = 0; x == arrayList.length; x++){
			System.out.print(arrayList[x]+ " ");
		}
	}

}
/*
java SortingAlgDriver
*/
 