package employees;

public class Employee {

    private String name;
    private Integer age;
    private String designation;
    private Long salary;
    private Integer experience;
    private String location;

    public Employee(String name, Integer age, String designation, Long salary, Integer experience, String location) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;
        this.location = location;
    }
    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", location='" + location + '\'' +
                '}';
    }
}
