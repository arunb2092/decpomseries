package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class Dup {

	public static void main(String[] args) {

		int ar[] = {1,1,3,2,4,5,5,6,6,6,5,6};
		int key = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<ar.length; i++) {
			
			if(!map.containsKey(ar[i])) {
				map.put(ar[i], 1);
			}
			else {
				key++;
				map.put(ar[i], key+1);
				key=1;
			}
			
		}
		map.forEach((k,v)->System.out.println(k + ":"+v));
		
	}

}
