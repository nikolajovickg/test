package test;

import test.model.School;
import test.model.SchoolClass;
import test.model.Student;
import test.model.Teacher;

import java.util.List;

public class App {
	public static void main(String[] args) {
		School school = new School("Dummy address");
		SchoolClass c1 = new SchoolClass("Physics", 95, 4);
		SchoolClass c2 = new SchoolClass("Physics", 87, 3);
		SchoolClass c3 = new SchoolClass("Biology", 65, 2);
		SchoolClass c4 = new SchoolClass("Mathematics", 95, 1);
		SchoolClass c5 = new SchoolClass("Chemistry", 95, 4);
		SchoolClass c6 = new SchoolClass("Sociology", 80, 3);
		SchoolClass c7 = new SchoolClass("Literature", 77, 1);

		Student student1 = new Student("John", "Doe");
		student1.getClasses().addAll(List.of(c1,c3,c4));
		Student student2 = new Student("Jane", "Doe");
		student2.getClasses().addAll(List.of(c2, c5, c6));
		Student student3 = new Student("John", "Smith");
		student3.getClasses().addAll(List.of(c7, c3, c2));
		Teacher teacher = new Teacher("First", "Last");
		school.getPeople().addAll(List.of(student1, student2, student3, teacher));
		school.getFirstPerson(Teacher.class).ifPresentOrElse(t -> System.out.println(t.toString()),
				() -> System.out.println("No teachers present"));
		school.getFirstPerson(Student.class).ifPresentOrElse(t -> System.out.println(t.toString()),
				() -> System.out.println("No students present"));
		System.out.println(student1.getClasses());
		System.out.println(student2.getAll4thYearClasses());
		System.out.println(student3.getAverageGrade());
	}
}
