
class StringCompare
{

	String s1; // declaring s1

	String s2; // declaring s2

	boolean val= false;


	public void setboolean()

	{
		System.out.print("set value of s1: ");

		s1 = System.console().readLine();  // reading value of s1 



		System.out.print("set value of s2: ");

		s2 = System.console().readLine(); // reading value of s2

	
		if(s1.equals(s2)) val=true; // comparing the two strings s1 and s2

		System.out.println("Contents of s1 and s2 are same :" + val);
	}


	public static void main(String args[])

	{
		 StringCompare sc= new StringCompare();

		 sc.setboolean();

	  


	}
}

