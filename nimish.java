class Demo
{
	int i;
	static int j= 20;
	void add()
	{
		int j = this.j;
		System.out.println(j);
	}
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.add();
	}
}
