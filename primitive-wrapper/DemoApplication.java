package com.veontomo.demo;

import java.util.Random;

public class DemoApplication {

	private static Random generator = new Random();

	public static void main(String[] args) {
		int n = 50000000;
		String choice = "int";
		if (args != null) {
			if (args.length > 0) {
				choice = args[0];
			}
			if (args.length > 1) {
				n = Integer.valueOf(args[1]);
			}
		}
		if ("int".equals(choice)) {
			System.out.println("Integer/int: " + runnerInteger(n));
		} else if ("long".equals(choice)) {
			System.out.println("Long/long: " + runnerLong(n));
		} else if ("double".equals(choice)) {
			System.out.println("Double/double: " + runnerDouble(n));
		} else if ("short".equals(choice)) {
			System.out.println("Short/short: " + runnerShort(n));
		} else if ("boolean".equals(choice)) {
			System.out.println("Boolean/boolean: " + runnerBoolean(n));
		} else if ("byte".equals(choice)) {
			System.out.println("Byte/byte: " + runnerByte(n));
		} else if ("char".equals(choice)) {
			System.out.println("Char/char: " + runnerChar(n));
		} else {
			System.out
					.print("Available arguments: int, long, double, short, boolean, byte, char");

		}
	}

	private static double runnerBoolean(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive boolean first");
			t1 = lookupPrimitiveBoolean(n);
			t2 = lookupWrapperBoolean(n);
		} else {
			System.out.println("Wrapper Boolean first");
			t2 = lookupWrapperBoolean(n);
			t1 = lookupPrimitiveBoolean(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerByte(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive byte first");
			t1 = lookupPrimitiveByte(n);
			t2 = lookupWrapperByte(n);
		} else {
			System.out.println("Wrapper Byte first");
			t2 = lookupWrapperByte(n);
			t1 = lookupPrimitiveByte(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerChar(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive char first");
			t1 = lookupPrimitiveChar(n);
			t2 = lookupWrapperChar(n);
		} else {
			System.out.println("Wrapper Char first");
			t2 = lookupWrapperChar(n);
			t1 = lookupPrimitiveChar(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerShort(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive short first");
			t1 = lookupPrimitiveShort(n);
			t2 = lookupWrapperShort(n);
		} else {
			System.out.println("Wrapper Short first");
			t2 = lookupWrapperShort(n);
			t1 = lookupPrimitiveShort(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerDouble(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive double first");
			t1 = lookupPrimitiveDouble(n);
			t2 = lookupWrapperDouble(n);
		} else {
			System.out.println("Wrapper Double first");
			t2 = lookupWrapperDouble(n);
			t1 = lookupPrimitiveDouble(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerLong(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive long first");
			t1 = lookupPrimitiveLong(n);
			t2 = lookupWrapperLong(n);
		} else {
			System.out.println("Wrapper Long first");
			t2 = lookupWrapperLong(n);
			t1 = lookupPrimitiveLong(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static double runnerInteger(int n) {
		long t1, t2;
		if (generator.nextBoolean()) {
			System.out.println("Primitive int first");
			t1 = lookupPrimitiveInt(n);
			t2 = lookupWrapperInteger(n);
		} else {
			System.out.println("Wrapper Integer first");
			t2 = lookupWrapperInteger(n);
			t1 = lookupPrimitiveInt(n);
		}
		if (t1 != 0) {
			return ((double) t2) / ((double) t1);
		} else {
			return -1.0d;
		}
	}

	private static long lookupPrimitiveInt(int s) {
		int[] elements = new int[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		int pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperInteger(int s) {
		Integer[] elements = new Integer[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		Integer pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveDouble(int s) {
		double[] elements = new double[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		double pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperDouble(int s) {
		Double[] elements = new Double[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1D;
		}
		Double pivot = 2D;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveShort(int s) {
		short[] elements = new short[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		short pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperShort(int s) {
		Short[] elements = new Short[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		Short pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveBoolean(int s) {
		boolean[] elements = new boolean[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = true;
		}
		boolean pivot = false;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperBoolean(int s) {
		Boolean[] elements = new Boolean[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = Boolean.TRUE;
		}
		Boolean pivot = Boolean.FALSE;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveByte(int s) {
		byte[] elements = new byte[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		byte pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperByte(int s) {
		Byte[] elements = new Byte[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		Byte pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveChar(int s) {
		char[] elements = new char[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 'a';
		}
		char pivot = 'b';
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperChar(int s) {
		Character[] elements = new Character[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 'a';
		}
		Character pivot = 'b';
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupPrimitiveLong(int s) {
		long[] elements = new long[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1;
		}
		long pivot = 2;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (pivot != elements[index]) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

	private static long lookupWrapperLong(int s) {
		Long[] elements = new Long[s];
		for (int i = 0; i < s - 1; i++) {
			elements[i] = 1L;
		}
		Long pivot = 2L;
		elements[s - 1] = pivot;
		int index = 0;
		long start = System.currentTimeMillis();
		while (!pivot.equals(elements[index])) {
			index++;
		}
		long duration = System.currentTimeMillis() - start;
		assert index == s - 1 : "Wrong index";
		return duration;
	}

}
