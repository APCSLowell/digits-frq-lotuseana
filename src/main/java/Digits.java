import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		int temp = num;
		digitList = new ArrayList <Integer>;
		String a = "";
		a +=num;
		int length = a.length();
		for (int i =0; i<length;i++){
			digitList.add(temp%10);
			temp = temp/10;
		}
	    
	}

	public boolean isStrictlyIncreasing()
	{ 
		
		for (int i =0; i<digitList.size()-1; i++){
			if (digitList.get(i)>=digitList.get(i+1)){
				return false;
			}
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
