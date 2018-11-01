package data_struct_and_libraries._1704_arranging_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * You work for a big and fast-moving company. Today, one of your colleagues called in sick and you
 * must fill in for them.
 * Your boss has told you that you have only one computer to complete some tasks. Each of them earns
 * the company an amount v of money and must be finished up to t hours from now. After that, it
 * cannot be performed anymore and has no more value. The computer completes exactly one task per
 * hour.
 * You want to impress your boss so he might give you a promotion. To do that, you intend to use
 * your programming skills to select which tasks execute in such a way that the amount of money lost
 * is minimized.
 *
 * Input
 * - The input is composed of several test cases and ends with end of file. Each one describes a
 *   list of tasks and starts with two integers N (1 <= N) and H (H <= 1000), which are, respectively,
 *   the number of tasks and the number of hours that the computer is available. Then follow N
 *   lines, each one with two integer v (1 <= v <= 1000) and t (1 <= t <= H) described above.
 *
 * Output
 * - For each test case output a line with an integer representing the minimum lost money.

 * @author e.dantas
 *
 */
public class Main {
/**
 *
read(N, H)
priority_queue tarefas[H]

dinheiro = 0
for i=1 to N:
    read(v, t)
    dinheiro += v
    tarefas[t].push(v)
for i=h downto 1:
    maior = 0
    maior_pos = 0
    for j=h downto i:
        if(!tarefas[j].empty() and tarefas[j].top() > maior):
            maior = tarefas[j].top()
            maior_pos = j
    if maior_pos > 0:
        dinheiro -= maior
        tarefas[maior_pos].pop()
print(dinheiro)
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		int N=0, H=0, V=0, T=0, money=0, maior=0, maior_pos=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		String[] str = null;
		Queue<Integer> tasks = new LinkedList<Integer>();
		while ((s=in.readLine())!=null) {
			str = s.split(" ");
			N = Integer.parseInt(str[0]);
			H = Integer.parseInt(str[1]);
			for (int i=0; i<N; i++) {
				str = in.readLine().split(" ");
				V = Integer.parseInt(str[0]);
				T = Integer.parseInt(str[1]);
				money += V;
				tasks.offer(V);
			}
			for (int i=H; i<1; i--) {
				maior = 0;
				maior_pos = 0;
				for (int j=H; j<i; j--) {
					if (!tasks.isEmpty() && tasks.peek() > maior) {
						maior = tasks.peek();
						maior_pos = j;
					}
				}
				if (maior_pos > 0) {
					money -= maior;
					tasks.poll();
				}
			}
			System.out.println(money);
		}
	}
}
