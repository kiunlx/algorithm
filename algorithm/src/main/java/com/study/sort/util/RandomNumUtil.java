package com.study.sort.util;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * 随机生成一个数组
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-26 14:19:14
 * 
 */
public class RandomNumUtil {

	public static Integer[] generate(int number) {

		Integer[] array = new Integer[number];

		for (int i = 0; i < number; i++) {

			int element = new Random().nextInt(10000000);
			array[i] = element;
		}
		return array;
	}

	public static void main(String[] args) {

		Integer[] array = RandomNumUtil.generate(100);
		System.out.println(Arrays.asList(array));
	}
}
