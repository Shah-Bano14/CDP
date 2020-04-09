package fta.practice.Shah;

public class EmployeeClass {

   // private int id;
    private String employee_name;
    private String age;
    private String salary;

    public EmployeeClass(String employee_name,String salary,String age )
    {
        //this.id=id;
        this.employee_name=employee_name;
        this.age=age;
        this.salary=salary;
    }

    public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

   /* public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/

}
