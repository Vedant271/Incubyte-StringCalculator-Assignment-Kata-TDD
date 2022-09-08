import java.util.*;

public class StringCalculator {

	public static int add(String ip_str) {
	    String delimiter = ",|\n";
	    String str = ip_str;
	    if (ip_str.startsWith("//")) {
	        int delimiterIdx = ip_str.indexOf("//") + 2;
	        delimiter = ip_str.substring(delimiterIdx, delimiterIdx + 1);
	        str = ip_str.substring(ip_str.indexOf("\n") + 1);
	    }
	    return add(str, delimiter);
	}
	
	public static int add(String str, String delimiter)  {
		if(!str.isEmpty()) {
			List Negatives = new ArrayList();
			String arr[] = str.split(delimiter);
			int x = arr.length;
			for(int i=0; i<x; i++) arr[i] = arr[i].strip();
			int sm = 0;
			for(int i=0; i<x; i++)
			{
				int y = 0;
				if(arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') sm += arr[i].charAt(0) - 'a' + 1;
				else {
					y = Integer.parseInt(arr[i]);
					if(y >= 1000) continue;
					if(y < 0) Negatives.add(y);
					sm += y;
					
				}
			}
			if (Negatives.size() > 0) {
		        throw new RuntimeException("Negatives not allowed: " + Negatives.toString());
		    }
			return sm;
		}
		return 0;
	}
}


