
public class Student {
	
	String name;
	int age;
	char gender;
	
	Student(){
		this.name="";
		this.age=0;
		this.gender='M';
	}
	
	Student(String n,int a,char g){
		this.name = n;
		this.age=a;
		this.gender=g;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		
		String str ="\n" + this.name + " , " + this.age + " , " + this.gender ;
		return str;
	}
	
}

