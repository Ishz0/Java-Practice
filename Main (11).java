interface A
{
	void C();
}

interface B extends A
{
    void D();
}
class F implements A
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

class E extends F implements B
{
    public void C()
    {
        System.out.println("ishan");
    }
}


class Main
{
	public static void main(String args[])
	{
	    E s=new E();
		s.C();
		s.D();
	}
}


