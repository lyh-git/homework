package day0606.dome03;

public class CourseInfo {
    private String type;
    private String id;
    private String name;
    private String programe;
    private String protime;
    private String vediotime;

    public CourseInfo() {
    }

    public CourseInfo(String type, String id, String name, String programe, String protime, String vediotime) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.programe = programe;
        this.protime = protime;
        this.vediotime = vediotime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrograme() {
        return programe;
    }

    public void setPrograme(String programe) {
        this.programe = programe;
    }

    public String getProtime() {
        return protime;
    }

    public void setProtime(String protime) {
        this.protime = protime;
    }

    public String getVediotime() {
        return vediotime;
    }

    public void setVediotime(String vediotime) {
        this.vediotime = vediotime;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", programe='" + programe + '\'' +
                ", protime='" + protime + '\'' +
                ", vediotime='" + vediotime + '\'' +
                '}';
    }

    public void ShowInfo(){
        System.out.println("CourseInfo{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", programe='" + programe + '\'' +
                ", protime='" + protime + '\'' +
                ", vediotime='" + vediotime + '\'' +
                '}');
    }
}
