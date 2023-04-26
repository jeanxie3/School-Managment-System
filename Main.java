package SchoolManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1,"Lizzy",500);
		Teacher tom = new Teacher(2,"Tom",600);
		Teacher ray = new Teacher(3,"Ray",6600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(tom);
		teacherList.add(ray);
		
		Student garbi = new Student(1,"Garbi",3);
		Student john = new Student(1,"John",3);
		Student bob = new Student(1,"Bob",3);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(garbi);
		studentList.add(john);
		studentList.add(bob);
		
		School s = new School(teacherList, studentList);
		
		john.payFees(330);
		System.out.println("School has earned: "+ s.getTotalMoneyEarned());
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("School has spent salay and now has: "+ s.getTotalMoneyEarned());
	}

}
