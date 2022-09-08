import java.util.*;

public class StringCalculator {

	public static int add(String str)  {
		if(!str.isEmpty()) {
			List Negatives = new ArrayList();
			String arr[] = str.split(",|\n");
			int x = arr.length;
			for(int i=0; i<x; i++) arr[i] = arr[i].strip();
			int sm = 0;
			for(int i=0; i<x; i++)
			{
				int y = 0;
				if(arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') sm += arr[i].charAt(0) - 'a' + 1;
				else {
					try
					{
						y = Integer.parseInt(arr[i]);
						if(y >= 1000) continue;
						if(y < 0) throw new ArithmeticException("Negative not allowed " + y);
						sm += y;
					}finally {}
				}
			}
			return sm;
		}
		return 0;
	}
	
}


