package day0603;

public class Boy {
    private int age;
    private String name;

    public Boy() {
    }

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
    public void marry(Girl girl){
        System.out.println("和"+girl.getName()+"结婚");
    }
    public void shout(){
        System.out.println("shout");
    }
}
