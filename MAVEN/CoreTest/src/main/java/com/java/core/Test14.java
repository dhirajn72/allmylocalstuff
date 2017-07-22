package com.java.core;

public class Test14 {
	public static void main(String[] args) {
		System.out.println(Day.MONDAY.ordinal());
		System.out.println(Day.SUNDAY.ordinal());
		System.out.println(Day.TEUSDAY.ordinal());
		System.out.println(Day.THURSDAY.ordinal());
		System.out.println(Day.FRIDAY.ordinal());

	}
}

enum Day {
	SUNDAY(90) {
		@Override
		public void show() {
		}
	},
	MONDAY {
		@Override
		public void show() {
		}
	},
	TEUSDAY {
		@Override
		public void show() {
		}
	},
	WEDNESDAY {
		@Override
		public void show() {
		}
	},
	THURSDAY {
		@Override
		public void show() {
		}
	},
	FRIDAY {
		@Override
		public void show() {
		}
	},
	SATURDAY {
		@Override
		public void show() {
		}
	};
	private Day() {

	}

	private Day(int x) {
		this.x = x;
	}

	int x;

	public Day getDay() {
		return Day.MONDAY;
	}

	public abstract void show();

}