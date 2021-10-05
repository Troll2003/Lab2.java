package laabs;

//створюємо клас студент
public class Student {

	public int age; 
	public String name; 
	public String sex;
	public int group;
	public int years_of_study;

//створюємо конструктор 1
	public Student(int y) {
		years_of_study = y;
	}
	
//створюємо конструктор	2
   public Student(int a,String n, String s, int g) {
	   age = a;
	   name = n;
	   sex = s;
	   group = g;
    }
  //cтворюємо гетери і сетери
   public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
}




      
