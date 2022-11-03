package Inheritance;

class A {

	public void sound_a() {

		System.out.println("AAAAAAAAa");
	}
}

class B extends A {

	public void sound_b() {

		System.out.println("bbbbbbbbbbbbb");
	}
}

class C extends B {

	public void sound_c() {

		System.out.println("cccccccccccccc");
	}
}

class D extends B {

	public void sound_d() {

		System.out.println("ddddddddddd");
	}
}

class E extends D {

	public void sound_e() {

		System.out.println("ddddddddddd");
	}
}

public class Hybrid {

	public static void main(String[] args) {

		D d = new D();
		d.sound_a();
		d.sound_b();
		d.sound_d();

		E e = new E();

		e.sound_a();
		e.sound_b();
		e.sound_d();
		e.sound_e();
	}

}
