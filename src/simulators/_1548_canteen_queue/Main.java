package simulators._1548_canteen_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * In the school you study, the recreation time is the most awaited time by most of the students.
 * Not just because the classes sometimes are tiring, but because the lunch is very good.
 * 
 * When the recreation alarm sounds, all the students go out running from the class to arrive as
 * early as possible in the canteen, such is the desire to eat. One of your teachers noticed that
 * there was an opportunity there.
 * 
 * Using a reward system, your math teacher decided that the order in which the students will be
 * served will not be given by the arrival time, but by the sum of grades obtained in class. In this
 * way, those with higher grades can be served before those with lower grades.
 * 
 * Your task is simple: given the arrival time of the students in the canteen, and their respective
 * grades in the math class, reorder the queue according to the math grades, and say how many
 * students don't need to change place in this reordering.
 * 
 * Input
 * - The first line contains an integer N, indicating the number of test cases to follow.
 *   Each test case starts with an integer M (1 <= M <= 1000), indicating the number of students.
 *   Following there will be M distinct integers Pi (1 <= Pi <= 1000), where the i-th integer
 *   indicates the grade of the i-th student.
 *   The above integers are given in the arrival order, or in other words, the first integer is from
 *   the first student to get to the queue, the second integer is from the second student, and so
 *   on.
 *   
 * Output
 * - For each test case print one line, containing one integer, indicating the number of students
 *   that don't need to change their places even after the queue being reordered.
 *   
 * @author e.dantas
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1548.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String N="", aux="";
		String[] P=null;
		Integer[] Pint = null;
		int M=0, cont=0;
	
		while((N=in.readLine()) != null) {
			for (int i=0; i<Integer.parseInt(N); i++) {
				M = Integer.parseInt(in.readLine());
				P = in.readLine().split(" ");
				for (int j=0; j<P.length; j++) {
					for (int k=0; k<P.length-1; k++) {
						if (Integer.parseInt(P[k]) < Integer.parseInt(P[k+1])) {
							aux = P[k+1];
							P[k+1] = P[k];
							P[k] = aux;
							cont++;
						}
					}
				}
				System.out.println(P.length-cont);
				cont=0;
			}
			
		}
		
	}

}
