package Java_8_features_JM;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {

	int id;
	String name;
	int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class Func_Interfaces_With_Collection {

	public static void main(String[] args) {

		// 1. Supplier → Create Student List
		Supplier<List<Student>> students = () -> {

			List<Student> list = new ArrayList<>();

			list.add(new Student(1, "Rohan", 85));
			list.add(new Student(2, "Amit", 35));
			list.add(new Student(3, "Sneha", 72));
			list.add(new Student(4, "Rahul", 28));
			list.add(new Student(5, "Priya", 90));

			return list;
		};

		// 2. Predicate → Filter Passed Students
		Predicate<Student> passed = s -> s.marks >= 40;

		// 3. Function → Convert Student into Result Message
		Function<Student, String> result = s -> s.name + " : Passed with " + s.marks + " marks";

		// 4. Consumer → Print Result
		Consumer<String> print = s -> System.out.println(s);

		// 5. Complete Flow
		students.get().stream().filter(passed).map(result).forEach(print);
	}
}