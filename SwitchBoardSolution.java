
public class SwitchBoardSolution {

	private boolean[] switches;
	
	public SwitchBoardSolution()
	{
		switches = new boolean[8];
	}
	
	/**
	 * 
	 * @param num where 0 <= num < 256
	 */
	
	public void flipSwitches(int num)
	{
		int[] x = new int[8];
		int y = 7;

		while(num > 0)
		{
			x[y] = num % 2;
			num /= 2;
			y--;
		}
		boolean[] b = getSwitches();
		for(int i = 0; i < switches.length; i++)
		{
			if(x[i] == 1)
			{
				b[i] = true;
			}
			else
			{
				b[i] = false;
			}
		}

	}
	
	public boolean[] getSwitches()
	{
		return switches;
	}
}

