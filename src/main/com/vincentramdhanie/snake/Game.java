package com.vincentramdhanie.snake;

import javax.swing.JFrame;

/**
 * The main class that runs the game. 
 * This class will set up the environment needed and
 * start the GUI.
 * @author vramdhanie@gmail.com (Vincent Ramdhanie)
 */
public class Game {

	static java.util.Map<Integer, Long> f;

	public static void main(String args[]){
		JFrame f = new SnakeFrame();
		//run(1, 200);
	}

	public static void run(int first, int last){
		long start = 0;
		long fin = 0;
		for(int i = first; i <= last; i++){
			f = new java.util.HashMap<Integer, Long>();
			f.put(0, 0L);
			f.put(1, 1L);
			start = System.nanoTime();
			System.out.printf("fib(%d) = %d\t", i, fib(i));
			fin = System.nanoTime();
			System.out.printf("Took %d nanoseconds\n", fin-start);	
		}
	}

	public static long fib(int n){
		if(f.containsKey(n)){
			return f.get(n);
		}else{
			long ans = fib(n-1) + fib(n - 2);
			f.put(n, ans);
			return ans;
		}
	}

}
