package simulators._1167_summer_camp;

/**
 * On july vacations, several schools in the same region decided to organize a summer camp for their
 * students. Usually in these camps, students are divided into collective chalets  by gender and
 * age, always with a supervisor or supervisor who, in addition to sleep ing in the cottage with the
 * group, are also responsible for creating and executing several interesting and exciting
 * activities for all ages. Among the many activities we can do mention of  games, excursions,
 * Gymkhana Musical, Night competitions, etc.. On the first day of camp due to heavy rain,
 * recreational activities were limited and the children were taken to the gymnasium. We conducted a
 * contest and one of the activities consisted of the same group children in a circle (arranged in a
 * counterclockwise direction) which would be removed one by one until only one child was left,
 * which would be the winner.
 * At the moment the child enters the circle it receives a small token containing a number between
 * 1 and 500. Once the circle is formed, it is counted up to the number corresponding to the token
 * the first child holds, beginning from the child besides him or her. The child where the counting
 * ends, should be removed from the group. The count starts again according to the number in the
 * token the child who has just been eliminated. In order to make the game more interesting, when
 * the number in the token is even, the counting is done clockwise, otherwise the counting is done
 * in a counterclockwise direction.
 * The play was very successful and the administrator of the camp asked you to develop a program for
 * the next event, to allow him to knows in advance which child will be the winner of each group,
 * based on the information provided.
 * 
 * Input
 * - The input contains many test cases. The first line of each input contains a single integer
 *   N (1 <= N <= 100), indicating the number of childrens that will participate of this game.
 *   follow N lines with two informations, the Name of the child and the Value of his token or card
 *   (1 <= Value <= 500) separated by a blank space, in order of appearance in the formation of the
 *   initial circle.
 *   
 *   Note: the child Name must be less than 30 characteres, with uppercase and lowercase letters
 *   and the "_" character (no spaces allowed). The end of input is determined by the number
 *   zero (0).
 *   
 * Output
 * - For each test case, one line must be printed with the message "Vencedor(a): xxxxxx" (that means
 *   Winning: xxxxxx), with one blank space after the ":" character, indicating the winner child.
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
