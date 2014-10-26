public class HomeWork {
    private String firstName;
    private int Age;
    public HomeWork (String firstName) {
        this.firstName = firstName;
    }
    public HomeWork (String firstName, int Age) {
        this.firstName = firstName;
        this.Age= Age;
    }
    public static void main(String[] args) {
        HomeWork s = new HomeWork("Helen", 16);
        System.out.println(s.firstName + " " + s.Age);
    }
    }
