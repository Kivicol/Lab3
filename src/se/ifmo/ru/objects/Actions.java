package se.ifmo.ru.objects;


public enum Actions {
    GETDOWN(" спуск по "),
    ENTER(" очутиться в"),
    ENTERMLTPL(" войти в"),
    GETTOSOLE(" попасть в"),
    STRETCH(" тянуться"),
    HANGSOLE(" висеть"),
    HANGMANY(" висят (много)"),
    STAND(" стоять"),
    USEFREEDOM(" пользоваться"),
    BAKEPOTATO(" печь картошку"),
    BOILSOUP(" варить похлёбку"),
    FRYPANCAKES(" жарить коржи"),
    HANGPANCAKES(" развешивать коржах"),
    GOTBAD(" поплохело"),
    CATCH(" подхватить под руки"),
    REASSURE(" успокоить"),
    LYING(" лежать");

    private String name;
    Actions(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
