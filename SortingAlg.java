
import java.util.ArrayList;


public class SortingAlg{
	
	private ArrayList<Integer> list;

	public SortingAlg(int amount){
		list = randomNumber(amount, list);
	}				
     
	public static ArrayList<Integer> randomNumber(int amount, ArrayList<Integer> list){

		for(int x = 0; x <= amount; x++){
			list.add((int) (Math.random() * 100) + 1);
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
			}     
   
}  

  