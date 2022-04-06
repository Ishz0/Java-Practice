interface R
{
	public void C();
}

interface SR extends R
{
    public void D();
}
class TV implements SR
{
	public void D()
	{
		System.out.println("Change Channel");
		System.out.println("One");
	}
	
	public void C()
	{
	    System.out.println("Voice");
	    System.out.println("Two");
	}
}
class Main
{
	public static void main(String args[])
	{
		TV s=new TV();
		s.C();
		s.D();
	}
}


