abstract class Pen
{
	abstract void write();
	abstract void refill();
}
class Fp extends Pen
{
	Fp()
	{
	    System.out.println("Fp Constructor");
	}
	void write()
	{
		
		System.out.println("Subjects for CE Dept is : ");
		System.out.print("1. APE\n2. Java\n3. WT\n4. CN\n");
	}	
	void refill()
	{
	    System.out.println("refill done");
	}
}

class Main
{
	public static void main(String args[])
	{
		Fp f=new Fp();
		f.write();
		f.refill();
	}
}

