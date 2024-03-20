package com.javaex.basic.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열),%d(십진수) %n(개행)
		//_개의 _중에서 _개를 먹었다
		String fruit="사과";
		int total=10,eat=3;
		System.out.printf("%d개의 %s중에서 %n를 먹었다",
				total,fruit,eat);
		int amount=1_234_567_890;
		System.out.printf("%d%n",
				amount);
		double pi =Math.PI;
		System.out.printf("%f%n: ",
				pi);
		String fmt="\"%d개의 %s 중에서 %d개를 먹었다%n";
		System.out.println(fmt.formatted(10,"바나나",2));
	}

}
