package mycollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSorting {
	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = getEmployeeMap();
		System.out.println(employeeMap);

		// Sort based on id
		Map<Integer, Employee> sortedOnIdMap = new TreeMap<>();
		sortedOnIdMap.putAll(employeeMap);
		System.out.println(sortedOnIdMap);

		// Sort based on age
		System.out.println("######### Sort by name#########");

		Comparator<Map.Entry<Integer, Employee>> comparator = (e1, e2) -> {
			return e1.getValue().getName().compareTo(e2.getValue().getName());
		};
		
		Function<Map.Entry<Integer, Employee>, Integer> keyMapper = e -> e.getKey();
		Function<Map.Entry<Integer, Employee>, Employee> valueMapper = e -> e.getValue();
		BinaryOperator<Employee> mergeFunction = (existing,replacement)-> existing;
		
		Map<Integer, Employee> sortedByNameMap =  employeeMap.entrySet().stream().sorted(comparator).collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, LinkedHashMap::new));

		System.out.println(sortedByNameMap);
	}

	public static Map<Integer, Employee> getEmployeeMap() {

		Employee rohit = new Employee(21, "rohit", "A-41", 31);
		Employee abhishek = new Employee(6, "abhishek", "A-46", 25);
		Employee rahul = new Employee(89, "rahul", "A-48", 23);
		Employee ashish = new Employee(4, "ashish", "A-40", 35);
		Employee deepak = new Employee(45, "deepak", "A-31", 38);

		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>() {
			{
				put(rohit.getId(), rohit);
				put(abhishek.getId(), abhishek);
				put(rahul.getId(), rahul);
				put(ashish.getId(), ashish);
				put(deepak.getId(), ashish);
			}
		};
		return employeeMap;
	}

}

class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desk=" + desk + ", age=" + age + "]\n";
	}

	private int id;
	private String name;
	private String desk;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesk() {
		return desk;
	}

	public void setDesk(String desk) {
		this.desk = desk;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int id, String name, String desk, int age) {
		super();
		this.id = id;
		this.name = name;
		this.desk = desk;
		this.age = age;
	}

}