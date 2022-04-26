package lab1;

public class Person implements HumanBeing {

	private String name;
	private String last_name;
	private String gender;
	private String id_code;
	private String phone_number;
	private int age;

	public Person() {
	}

	public Person(String name, String last_name) {
		this.name = name;
		this.last_name = last_name;
	}

	public Person(String name, String last_name, String gender, String id_code, int age, String phone_number) {
		this.name = name;
		this.last_name = last_name;
		this.gender = gender;
		this.id_code = id_code;
		this.age = age;
		this.phone_number = phone_number;
	}

	@Override
	public void speak() {
		System.out.println("I am a person");
	}

	@Override
	public boolean breathe() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean procreate() {
		return false;
	}

	/**
	 * TestPrint
	 */

	public String getLast_name() {
		return last_name;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getId_code() {
		return id_code;
	}

	public int getAge() {
		return age;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public boolean isAdult() {
		return this.getAge() >= 18;
	}

	public boolean isGender(char g) {
		return this.getGender().equals(Character.toString(g));
	}

	@Override
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (this.id_code.equals(p.id_code)) {
			return true;
		} else {
			return false;
		}
	}

	public static void getAdults(Person[] p) {
		System.out.print("ADULTS : ");
		for (Person element : p) {
			if (element.isAdult())
				System.out.print(element.getName() + " " + element.getLast_name() + ", ");
		}
		System.out.println();
	}

	public static void getJuveniles(Person[] p) {
		System.out.print("JUVENILES : ");
		for (Person element : p) {
			if (!element.isAdult())
				System.out.print(element.getName() + " " + element.getLast_name() + ", ");
		}
		System.out.println();
	}

	public static void getMales(Person[] p) {
		System.out.print("MALES : ");
		for (Person element : p) {
			if (element.isGender('M'))
				System.out.print(element.getName() + " " + element.getLast_name() + ", ");
		}
		System.out.println();
	}

	public static void getFemales(Person[] p) {
		System.out.print("FEMALES : ");
		for (Person element : p) {
			if (element.isGender('F'))
				System.out.print(element.getName() + " " + element.getLast_name() + ", ");
		}
		System.out.println();
	}

}
