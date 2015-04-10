package _1_beginners.page01._1040_average_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding
 * to 4 scores obtained by a student. Calculate the average with weights 2, 3, 4 e 1 respectively,
 * for these 4 scores and print the message "Media: " (Average), followed by the calculated result.
 * If the average was 7.0 or more, print the message "Aluno aprovado." (Approved Student). If the
 * average was less than 5.0, print the message: "Aluno reprovado." (Reproved Student). If the
 * average was between 5.0 and 6.9, including these, the program must print the message "Aluno em
 * exame." (In exam student).
 * In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed
 * by the typed score. Recalculate the average (sum the exam score with the previos calculated
 * average and divide by 2) and print the message “Aluno aprovado.” (Approved student) in case of
 * average 5.0 or more) or "Aluno reprovado." (Reproved student) in case of average 4.9 or less. For
 * these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final 
 * average) follow by the final average for this student in the last line.
 * 
 * Input
 * - The input contains four floating point numbers that represent the students' grades.
 * 
 * Output
 * - Print all the answers with one digit after the decimal point.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Double N1=0.0, N2=0.0, N3=0.0, N4=0.0, media=0.0, NF=0.0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.0");
		String[] s = in.readLine().split(" ");
		N1 = Double.parseDouble(s[0]);
		N2 = Double.parseDouble(s[1]);
		N3 = Double.parseDouble(s[2]);
		N4 = Double.parseDouble(s[3]);
		media = ((N1*2) + (N2*3) + (N3*4) + (N4))/10;
		System.out.println("Media: " + df.format(media));
		if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			NF = Double.parseDouble(in.readLine());
			System.out.println("Nota do exame: " + df.format(NF));
			media = (media + NF)/2;
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");			
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(media));
		} else if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}			
		in.close();
	}
}
