
public class MySin 
{
	public static void main(String args[])
	{
		MySin mySin = new MySin();;
		System.out.println(mySin.sin(Math.PI) );
		System.out.println(mySin.sin(Math.PI/6));
	}
	
	public static double sin(double input)
	{
		double output = input;
		int change = -1;  //用來控制每次的變因，第一次是減，第二次是加，以此類推
		for(int i = 1 ; i <= 10 ; i++)
		{
			output += change * (Math.pow(input, i*2+1) / factorial(i*2+1) );
			change *= -1;
		}
		return output;
	}
	
	
	/*
	 * 數學的階乘; factorial(3) = 3*2*1
	 */
	public static double factorial(double s) 
	{
		double r = 1;

		for (int i = 1; i <= s; i++) 
		{
			r = r * i;
		}
		return r;
	}
}
