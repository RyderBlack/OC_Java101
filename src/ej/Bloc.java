package ej;

public class Bloc {

    String description;

    Bloc() {
        this.description = "Hello from the Bloc!";
    }

    void displayDescription() {
        System.out.println(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
