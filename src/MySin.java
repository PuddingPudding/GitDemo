
public class MySin 
{
	/*
	 * �ƾǪ�����; factorial(3) = 3*2*1
	 */
	double factorial(double s) 
	{
		double r = 1;

		for (int i = 1; i <= s; i++) 
		{
			r = r * i;
		}
		return r;
	}
}
