import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		r.hide();
		String colormuch = JOptionPane.showInputDialog("What color do you choose?(black or blue)");
		if (colormuch.equals("blue")) {

			r.setPenColor(Color.blue);
		}
		r.penDown();
		r.setPenWidth(10);
		r.setSpeed(100);

		for (int i = 0; i < 4; i++) {
			r.move(100);
			r.turn(90);
		}

		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape

	}

}
