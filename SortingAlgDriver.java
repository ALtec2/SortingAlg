

public class SortingAlgDriver{
	public static void main(String[] args){
		//creating a random array list of number 1 - 1000
		int amount = 1000;
		int[] arrayList = new int[amount];
		arrayList = randomNumber(amount);
		arrayListPrint(arrayList);


	}

	public static int[] randomNumber(int amount){
		int[] arrayList = new int[amount];

		for(int x = 0; x <= arrayList.length-1; x++){
			arrayList[x] = (int) (Math.random() * 1000) + 1;
		}
		return arrayList;
	}

	public static void arrayListPrint(int arrayList[]){
		for (int item : arrayList) {
		    System.out.print(item+ " ");
		}
	}

	public static boolean checkIfNotSort(int arrayList[]){
		for(int x = 0; x <= arrayList.length-1; x++){
			if(arrayList[x] < arrayList[x+1])
				;
			else
				return true;
		}
		return false;
	}

	public static void quickSortDemo(int arrayList[]){
		int x;
		while(checkIfNotSort(arrayList)){
			x = Math.random()*arrayList.length-1
		}
	}

} 
/*
java SortingAlgDriver
*/
 
