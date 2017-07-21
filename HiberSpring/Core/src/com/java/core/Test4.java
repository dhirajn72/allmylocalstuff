package com.java.core;

import java.awt.List;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class Test4 {
	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add(new Student(99, "dk"));
		list.add(new Student(56, "sk"));
		list.add(new Student(89, "mk"));
		list.add(new Student(12, "ak"));
		list.add(new Student(78, "dk"));
		list.add(new Student(42, "rk"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
