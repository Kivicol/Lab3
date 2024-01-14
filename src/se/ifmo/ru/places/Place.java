package se.ifmo.ru.places;

public class Place extends AbsPlace {
    private Places type;

    public Place(String name){
        this.place_name = name;
        System.out.println("Место " + this.place_name + " создано");
    }
    public void placeCondition(String condition) {
        this.condition = condition;
        System.out.println("Состояние места (" + this.type.getName() + "): " + this.condition);
    }
    public void whatsgoing() {
        System.out.println("\033[36mВ месте (" + this.type.getName() + ") проиcходит:\033[0m \n");
    }
    public void whatstheplace() {
        System.out.println("(" + this.getType().getName() + ")");
    }

    public void setType(Places type){
        this.type = type;
        type_name = "";
        switch (type){
            case ROOM:
                type_name = "комната";
                break;
            case LADDER:
                type_name = "лестница";
                break;
            case CEILING:
                type_name = "потолок";
                break;
            case SHELVES:
                type_name = "полки";
                break;
            case DOOR:
                type_name = "дверь";
                break;
        }
        System.out.println(place_name +" инициализирована как " + "(" + type_name + ")");
    }

    @Override
    public Places getType() {
        return this.type;
    }

}
