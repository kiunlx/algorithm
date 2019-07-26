package com.study.sort;

import java.util.Arrays;

import com.study.sort.util.RandomNumUtil;

/**
 *
 * 冒泡排序
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-26 14:18:27
 * 
 */
public class BubbleSort {

	public static void sort() {

		Integer[] array = RandomNumUtil.generate(5000);
		System.out.println(Arrays.asList(array));
		long time = System.currentTimeMillis();
		System.out.println(time);
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(System.currentTimeMillis() - time);
		System.out.println(Arrays.asList(array));
	}

	public static void main(String[] args) {
		sort();
	}
}
