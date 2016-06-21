import java.util.*;


public class OccurencesOfNumberInArray{
	public static void main(String[] args) {
		int[] numbers = {1, 8, 3, 4, 3, 2, 5, 7, 3, 1, 4, 5, 6, 4, 3};

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<numbers.length;i++) {
			int key = numbers[i];

			if(map.containsKey(key)){
				int occurence = map.get(key);
				occurence++;
				map.put(key,occurence);
			}
			else{
				map.put(key,1);
			}
		}

		Iterator iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			int key = (Integer) iterator.next();
			int occurence = map.get(key); //can put any number to find its occurences explicitly map.get(2) gets occurences of number 2

			System.out.println(key + " occur " + occurence + " times.");
		}
	}
}