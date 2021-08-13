package test.model;

import java.util.UUID;

public abstract class Person {
	protected final UUID _uniqueId;
	protected final String _firstName;
	protected final String _lastName;

	public Person(String firstName, String lastName) {
		_uniqueId = UUID.randomUUID();
		_firstName = firstName;
		_lastName = lastName;
	}

	public UUID getUniqueId() {
		return _uniqueId;
	}

	@Override
	public String toString() {
		return "Person{" +
				"_uniqueId=" + _uniqueId +
				", _firstName='" + _firstName + '\'' +
				", _lastName='" + _lastName + '\'' +
				'}';
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}
}
