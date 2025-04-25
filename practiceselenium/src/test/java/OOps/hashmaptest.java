package OOps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmaptest {

	public static void main(String[] args) {

		Map<String,Integer> map = new LinkedHashMap<>();
		
		map.put("Test1", 1);
		map.put("Test2", 2);
		map.put("Test3", 3);
		map.put("Test4", 4);
		
		//System.out.println(map);
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
				{
			System.out.println(entry.getKey()+""+entry.getValue());
				}

		
		
	}

}
