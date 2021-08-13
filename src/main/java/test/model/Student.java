package test.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Person {

	private final List<SchoolClass> _classes;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		_classes = new ArrayList<>();
	}

	public List<SchoolClass> getClasses() {
		return _classes;
	}

	public List<SchoolClass> getAll4thYearClasses() {
		return _classes.stream()
				.filter(schoolClass -> schoolClass.getYear() == 4)
				.collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Student{" +
				"_uniqueId=" + _uniqueId +
				", _firstName='" + _firstName + '\'' +
				", _lastName='" + _lastName + '\'' +
				", _classes=" + _classes +
				"} " + super.toString();
	}

	public double getAverageGrade() {
		return _classes.stream()
				.mapToDouble(SchoolClass::getGrade)
				.average()
				.orElse(Double.NaN);
	}
}
