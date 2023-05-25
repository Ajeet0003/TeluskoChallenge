package com.learn.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
	String state() default "Jharkhand";

	String district() default "Ranchi";
}

@CricketPlayer
class Dhoni {

	int age;
	int run;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

public class Annotations {
	public static void main(String[] args) {
		Dhoni obj = new Dhoni();
		obj.setAge(40);
		obj.setRun(10000);
		System.out.println(obj.getAge());
		System.out.println(obj.getRun());
		
		Class c=obj.getClass();
		Annotation annotation = c.getAnnotation(CricketPlayer.class);
		
		CricketPlayer cricketPlayer=(CricketPlayer) annotation;
		System.out.println(cricketPlayer.district());
		System.out.println(cricketPlayer.state());
	}
}