package se.ifmo.ru.objects;

import java.util.Objects;

public class Entity extends AbsEnt {
    public Entity(){
        System.out.println("Что-то было создано?...");
    }
    public Entity(String name){
        this.name = name;
        System.out.println("Что-то с названием \"" + name + "\" было создано");
    }

    public String chracteristic(Condition condition) {
        this.condition = condition;
        switch (condition) {
            case DOES:
                System.out.print(this.name + " выполняет действие: ");
                break;
            case LOOKRND:
                System.out.println(this.name + " осматривается ");
                break;
            case EXISTS:
                System.out.print(this.name + ": ");
                break;
        }
        return null;
    }
    public void action(Actions... actions) {
        for (Actions action : actions) {
            switch (action) {
                case GETTOSOLE:
                    System.out.print("попасть в");
                    break;
                case GETDOWN:
                    System.out.print("спуск по ");
                    break;
                case ENTER:
                    System.out.print("очутиться в ");
                    break;
                case ENTERMLTPL:
                    System.out.print("войти в ");
                    break;
                case STRETCH:
                    System.out.print("тянутся через ");
                    break;
                case HANGSOLE:
                    System.out.print("висит под ");
                    break;
                case HANGMANY:
                    System.out.print("висят ");
                case LYING:
                    System.out.print("лежать на ");
                    break;
                case STAND:
                    System.out.print("стоять ");
                    break;
                case USEFREEDOM:
                    System.out.println("пользоваться свободой");
                    break;
                case BAKEPOTATO:
                    System.out.print("печь картошку");
                    break;
                case BOILSOUP:
                    System.out.print("варить похлёбку");
                    break;
                case FRYPANCAKES:
                    System.out.print("жарить коржи");
                    break;
                case HANGPANCAKES:
                    System.out.print("развешивать коржи");
                    break;
                case CATCH:
                    System.out.print("подхватить под руки ");
                    break;
                case GOTBAD:
                    System.out.println("поплохело");
                    break;
                case REASSURE:
                    System.out.print("успокоить ");
                    break;
            }
            if (actions.length > 1 && action != actions[actions.length - 1]) {
                System.out.print(", ");
            }
        }
    }
    public void action(Integer damage, Actions... actions) {
        int smelliness = 0;
        for (Actions action : actions) {
            switch (action) {
                case BAKEPOTATO:
                    System.out.print("печь картошку (+" + damage + " вони)");
                    smelliness = smelliness + damage;
                    break;
                case BOILSOUP:
                    System.out.print("варить похлёбку (+" + damage + " вони)");
                    smelliness = smelliness + damage;
                    break;
                case FRYPANCAKES:
                    System.out.print("жарить коржи (+" + damage + " вони)");
                    smelliness = smelliness + damage;
                    break;
                case HANGPANCAKES:
                    System.out.print("развешивать коржи (+" + damage + " вони)");
                    smelliness = smelliness + damage;
                    break;
                default:
                    System.out.println("Олух, как ты этим нанесёшь урон?");
            }
            if (actions.length > 1 && action != actions[actions.length - 1]) {
                System.out.print(", ");
            }
        }
        if (smelliness != 0) {
            System.out.println("\n\033[36mВоняет с силой: " + smelliness + "\033[0m");;
            odor = smelliness;
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
