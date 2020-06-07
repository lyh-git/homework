package day0603;

public class Girl {
    private String name;

    public Girl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println("和"+boy.getName()+"结婚");
    }
}
