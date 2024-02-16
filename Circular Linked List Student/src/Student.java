
public class Student {
	String name;
	int age;
    char gender;
	
	Student(){
		this.name=null;
		this.age=0;
		this.gender='M';
	}
	
	Student(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public String toString() {
		String str= "Name:" + this.name + " Age:" + this.age+ " Gender:"+ this.gender;
		
		return str;
	}
	
}
