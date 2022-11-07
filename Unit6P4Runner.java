import java.util.Arrays;

public class Unit6P4Runner {

	public static void main(String[] args) {
		
		int n = 87;
		SwitchBoardSolution board = new SwitchBoardSolution();
		board.flipSwitches(n);
		System.out.println(Arrays.toString(board.getSwitches()));

	}

}
