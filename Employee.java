class Employee{
	private int id;
	private String name;
	private int age;

	public void setId(int a){
		id=a;
	}

	public int getId(){
		return id;
	}

	public void setName(String s){
		name=s;
	}

	public String getName(){
		return name;
	}

	public void setAge(int b){
		age=b;
	}

	public int getAge(){
	return age;
	}
	
	public String printData(){
	
	System.out.println(id+name+age);
	}


	

	public static void main(String[]args){
	
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("SArika");
		employee.setAge(23);
		System.out.println(employee.printData());
	}

}