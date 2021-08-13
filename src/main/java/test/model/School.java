package test.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class School {
	public List<Person> getPeople() {
		return _people;
	}

	private final List<Person> _people;
	private final String _address;

	public School(String address) {
		_address = address;
		_people = new ArrayList<>();
	}

	public List<Student> getStudens() {
		return _people.stream()
				.filter(person -> person instanceof Student)
				.map(person -> (Student) person)
				.collect(Collectors.toList());
	}

	public List<Teacher> getTeachers() {
		return _people.stream()
				.filter(person -> person instanceof Teacher)
				.map(person -> (Teacher) person)
				.collect(Collectors.toList());
	}

	public String getAddress() {
		return _address;
	}

	@Override
	public String toString() {
		return "School{" +
				"_people=" + _people +
				", _address='" + _address + '\'' +
				'}';
	}
	//List might be empty, so Optional is used as a null safeguard
	public <T extends Person> Optional<T> getFirstPerson(Class<T> type) {
		return _people.stream()
				.filter(person -> type.isAssignableFrom(person.getClass()))
				.map(type::cast)
				.findFirst();
	}
}
