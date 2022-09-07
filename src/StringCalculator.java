import java.util.*;

public class StringCalculator {

	public static int add(String str)  {
		if(!str.isEmpty()) {
			String arr[] = str.split(",");
			int x = arr.length;
			for(int i=0; i<x; i++) arr[i] = arr[i].strip();
			int sm = 0;
			for(int i=0; i<x; i++)
			{
				int y = 0;
				if(arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') sm += arr[i].charAt(0) - 'a' + 1;
				else {
					y = Integer.parseInt(arr[i]);
					sm += y;
				}
			}
			return sm;
		}
		return 0;
	}
	
}
