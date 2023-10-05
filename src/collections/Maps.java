package collections;
import java.util.*;
//import java.util.Map.Entry;

public class Maps {
public static void main(String[] args) {
	Map<Integer, String> m = new HashMap<>();
	m.put(200, "Ravi");
	m.put(2002, "Kavi");
//	m.put(20, "Havi");
//	m.put(4, "aavi");
//	m.put(505, "Ravi");
//	m.put(6, "Kavi");	m.put(7, "Havi");
//	m.put(8, "aarthi");	m.put(9, "som");m.put(10, "neha");m.put(11, "ganesh");
//	m.put(12, "surya");	m.put(13, "Rav");m.put(14, "Ka");	m.put(15, "i");m.put(16, "vi");
//	m.put(17, "avi");m.put(18, "Ravi");m.put(19, "Kavi");
//	m.put(20, "Havi");m.put(21, "aavi");m.put(22, "Ravi");
//	m.put(23, "Kavi");m.put(24, "Havi");m.put(25, "aarthi");m.put(26, "som");m.put(27, "neha");m.put(28, "ganesh");m.put(29, "surya");m.put(30, "Rav");m.put(31, "Ka");
//	m.put(32, "i");m.put(33, "vi");
//	System.out.println(m);
	Set<Integer> k=m.keySet();
	for (Integer integer : k) {
		System.out.println(integer.hashCode());
	}
//	Collection<String> s =m.values();
//	for (String integer : s) {
//		System.out.print(integer);
//	}
//	Set<Entry<Integer, String>> m2 =m.entrySet();
//	for (Entry<Integer, String> entry : m.entrySet()) {
//		System.out.println(entry.getKey()+":"+entry.getValue());
//	}
	
//	System.out.println(m.getOrDefault(1, "r"));
//	m.remove(22);
//	System.out.println(m.size());
//	m.replace(1, "Ravi", "ravi");
//	for(Map.Entry i : m.entrySet()) {
//		System.out.println(i.getKey());
//	}
//	System.out.println(m.hashCode()); 
}
}
