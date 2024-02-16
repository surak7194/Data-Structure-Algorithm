
public class Student {
	
	String name;
	int age;
	char gender;
	
	Student(String n, int a, char g) {
		name = n;
		age = a;
		gender = g;
	}

	public String toString() {
		
		String str = "\nName: "+name + "\nAge: " + age + "\nGender: " + gender+"\n";
		return str;
	}
}
