package se.ifmo.ru.objects;

public enum Condition {
    LOOKRND("осматривается"),
    EXISTS(""),
    DOES("выполняет действие");

    private String name;

    Condition(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}