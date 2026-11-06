import java.util.ArrayList;

public class SortingAlgDriver{
	public static void main(String[] args){
		//creating a random array list of number 1 - 1000
		int amount = 10;
		ArrayList<Integer> list = new ArrayList<>();
		list = randomNumber(amount, list);
		arrayListPrint(list);
		quickSortDemo(list);


	}

	public static ArrayList<Integer> randomNumber(int amount, ArrayList<Integer> list){

		for(int x = 0; x <= amount; x++){
			list.add((int) (Math.random() * 10) + 1);
		}
		return list;
	}

	public static void arrayListPrint(ArrayList<Integer> list){
		for (Integer item : list) {
		    System.out.print(item+ " ");
		}
		System.out.println("");
	}

	public static boolean checkIfNotSort(ArrayList<Integer> list){
		for (int x = 0; x < list.size() - 1; x++) {
	        if (list.get(x) > list.get(x + 1)) {
	            return true;
        	}
    	}
    return false;
	}

	public static void quickSortDemo(ArrayList<Integer> list){
		int x = list.size()-1;
		ArrayList<Integer> less = new ArrayList<>();
		ArrayList<Integer> more = new ArrayList<>();
		ArrayList<Integer> same = new ArrayList<>();
		while(checkIfNotSort(list)){
			x--;
			for(Integer item : list){
				if(list.get(x) > item){
					less.add(item);
				}
				else if(list.get(x) < item){
					more.add(item);
				}
				else{
					same.add(item);
				}
			}
			list.clear();
			list.addAll(less);
			list.addAll(same);
			list.addAll(more);
			less.clear();
			same.clear();
			more.clear();
			arrayListPrint(list); 
		}
		if(x == 2){
			x = list.size()-1;
		}
	}

} 
/*
java SortingAlgDriver
*/
 
