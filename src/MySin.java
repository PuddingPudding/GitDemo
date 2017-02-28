
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
		int change = -1;  //�Ψӱ���C�����ܦ]�A�Ĥ@���O��A�ĤG���O�[�A�H������
		for(int i = 1 ; i <= 10 ; i++)
		{
			output += change * (Math.pow(input, i*2+1) / factorial(i*2+1) );
			change *= -1;
		}
		return output;
	}
	
	
	/*
	 * �ƾǪ�����; factorial(3) = 3*2*1
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
