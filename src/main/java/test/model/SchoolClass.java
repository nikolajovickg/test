package test.model;

public class SchoolClass {
	private final String _className;
	private final int _grade;
	private final int _year;

	public SchoolClass(String className, int grade, int year) {
		_className = className;
		_grade = grade;
		_year = year;
	}

	public String getClassName() {
		return _className;
	}

	public int getGrade() {
		return _grade;
	}

	public int getYear() {
		return _year;
	}

	@Override
	public String toString() {
		return "SchoolClass{" +
				"_className='" + _className + '\'' +
				", _grade=" + _grade +
				", _year=" + _year +
				'}';
	}
}
