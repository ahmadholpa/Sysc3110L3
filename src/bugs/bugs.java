package bugs;

import java.util.ArrayList;
import java.util.List;

public class bugs {
	
	private List<String> buddyinfo;
	
	public bugs ()
	{
		buddyinfo = new ArrayList<>();
	}
	
	private void addbuddies(String s)
	{
		buddyinfo.add(s);
	}
	
	public static void main(String args[])
	{
		System.out.println("hello");
		
		bugs bg= new bugs();
		
		bg.addbuddies("walla");
		
	}

}
