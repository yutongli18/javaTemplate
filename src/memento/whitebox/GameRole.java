package memento.whitebox;

// 发起人角色
public class GameRole {

    // 状态
    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // 初始化状态
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    // 战斗方法
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    // 展示状态
    public void showState() {
        System.out.println("角色生命力：" + vit +
                           "\n角色攻击力：" + atk +
                           "\n角色防御力：" + def +
                           "\n=====================");
    }
}
