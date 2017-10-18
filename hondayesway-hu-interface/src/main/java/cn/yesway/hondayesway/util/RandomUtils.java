package cn.yesway.hondayesway.util;

import java.util.Random;

public class RandomUtils {

	/**
	 * 生成[min,max]区间中的随机数
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getRandomNumber(int min, int max) {
		Random rand = new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}
	
	/**
	 * 生成length长度的随机数
	 * @param length
	 * @return
	 */
	public static String getRandomNumber(int length) {
		String fmt = "%0" + (length - 1) + "d";
		String max = String.format(fmt, 0); 
		int offset = Integer.valueOf(1 + max);
		int result = (int) ((Math.random() * 9 + 1) * offset);
		
		return String.valueOf(result);
	}
	 
	
	public static void main(String[] args) {
		String num = getRandomNumber(6);
		System.out.println(num);
	}
}
