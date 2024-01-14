package se.ifmo.ru.objects;

public abstract class AbsEnt implements IntObj, HonestReaction {
    protected String name;
    protected Condition condition;
    protected Reaction reaction;
    protected Integer HP;
    static Integer odor;
    public AbsEnt(){}
    public Integer getHP(){
        return this.HP;
    }

    public static Integer getOdor() {
        return odor;
    }

    public void setHP(Integer hp){
        this.HP = hp;
        System.out.println("\033[36mЗдоровье объекта \"" + this.name + "\": " + this.HP + "\033[0m");
    }
    public void damageGet(Integer damage){
        this.HP -= damage;
        System.out.println("\033[36mОбъект \"" + this.name + "\" получил урон: -" + damage + "\nЗдоровье объекта \"" + this.name + "\": " + this.HP + "\033[0m");
    }
    public void checkHP() {
        if (this.HP == 100){
            System.out.println(this.name + " чувствует себя хорошо");
        }
        else if (this.HP < 100 && this.HP > 50){
            System.out.println(this.name + " чувствует себя средне");
        }
        else if (this.HP < 50 && this.HP > 20){
            System.out.println(this.name + " чувствует себя посредственно");
        }
        else if  (this.HP <= 20 && this.HP > 0){
            System.out.println(this.name + " находится присмерти");
        }
        else if (this.HP <= 0){
            System.out.println(this.name + " герои не умирают.\n \033[31mРЕСТАРТ");
        }
    }
    public void toWhom() {
        System.out.println("объект \"" + this.getName() + "\"");
    }
    public void entCondition(String condition) {
        System.out.print("Состояние объекта \"" + this.name.toLowerCase() + "\": " + condition);;
    }
    public String reactiontothis(Reaction react) {
        String condition = "";
        this.reaction = react;
        switch (reaction){
            case LIKEKATALAZHKA:
                condition = "очень похоже на каталажку";
                condition = condition + " (по мнению " + this.name + ")";
                break;
            case NICE:
                condition = "да норм";
                condition = condition + " (по мнению " + this.name + ")";
                break;
            case SMELLY:
                condition = "воняет";
                condition = condition + " (по мнению " + this.name + ")";
        }
        return condition;
    }
    public String reactiontothis(Integer damage, Reaction react) {
        String condition = "";;
        this.reaction = react;
        switch (reaction){
            case SMELLY:
                condition = "воняет";
                this.HP = this.HP - damage;
                condition = condition + " (по мнению " + this.name + "\033[36m(" + damage + " урона по респираторной системе)\033[0m)";
                break;
        }
        return condition;
    }

}
