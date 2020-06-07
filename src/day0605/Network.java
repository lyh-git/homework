package day0605;

public class Network {
    public static void main(String[] args) {
        Network network = new Network("1213", "123456");
        System.out.println(network.toString());
        Network network1 = new Network();
        System.out.println(network1.toString());
    }

    private String id;
    private String password;
    private String email;

    public Network() {
        if (this.password == null || this.id == null) {
            throw new AssertionError("id和用户密码是必须的");
        }
    }

    public Network(String id, String password) {
        this.id = id;
        this.password = password;
        if (this.password == null || this.id == null) {
            throw new AssertionError("id和用户密码是必须的");
        }
        this.email = id + "@gameschool.com";
    }

    @Override
    public String toString() {
        return "Network{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
