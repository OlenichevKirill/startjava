package com.startjava.lesson_1.variable;

public class Variable {
	public static void main(String[] args) {
		byte core = 4;
		short flow = 4;
		int cpu = 6500;
		long ram = 16384;
		float frequency = 3.2f;
		double frequency1 = 3.2d;
		char name = 'K';
		boolean videoСard = true;

		System.out.println("Количество ядер: " + core);
		System.out.println("Количестов потоков: " + flow);
		System.out.println("Модель процессора Intel: " + cpu);
		System.out.println("Количество ОЗУ, Мб: " + ram);
		System.out.println("Частота по типу float: " + frequency);
		System.out.println("Частота по типу double: " + frequency1);
		System.out.println("Первая буква моего имени: " + name);
		System.out.println("Есть ли видеокарта: " + videoСard);
	}
}