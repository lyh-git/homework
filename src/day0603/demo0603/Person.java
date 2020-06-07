package day0603.demo0603;

public class Person {
    private String name;
    private int age;
    // 类全名：完整包名+路径名
    private java.util.Date birthDate;
    private Double weight;
    private Math math;

    public Person(String name, int age, java.util.Date birthDate) {
        super();
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Person(String name, int age, Double weight) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age) {

        this(name, age, 1.5);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            return other.name == null;
        } else {
            return name.equals(other.name);
        }
    }

}
