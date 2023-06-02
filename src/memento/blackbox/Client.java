package memento.blackbox;

// 客户类
public class Client {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.initState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());
        role.showState();

        role.fight();
        role.showState();

        role.recoverState(caretaker.getMemento());
        role.showState();
    }
}
