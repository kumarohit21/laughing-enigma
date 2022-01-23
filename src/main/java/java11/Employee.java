package java11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		boolean equality =  obj instanceof Employee && name == ((Employee) obj).name;
		System.out.println("Equality	"+ equality);
		return equality;
	}

//	public int hashCode() {
//		int hasCode = this.name.hashCode();
//		System.out.println("HashCode	" + hasCode);
//		return hasCode;
//	}
//	

	public static void main(String[] args) {
		Map<Employee, List<Address>> empAddress = new HashMap<>();
		empAddress.put(new Employee("A"), Arrays.asList(new Address("St1"), new Address("St2")));

		empAddress.put(new Employee("A"), Arrays.asList(new Address("St3"), new Address("St4")));

		System.out.println(empAddress.size());
		List<Address> address = empAddress.get(new Employee("A"));
		System.out.println(address);
		//System.out.println((new Employee("A")).equals(new Employee("A")));

	}

}

class Address {
	private String streetName;

	public Address(String streetName) {
		this.streetName = streetName;
	}
}