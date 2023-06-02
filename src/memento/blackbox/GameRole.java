package memento.blackbox;

// 生成者
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
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    // 展示状态
    public void showState() {
        System.out.println("角色生命力：" + vit +
                "\n角色攻击力：" + atk +
                "\n角色防御力：" + def +
                "\n=====================");
    }

    // 内部类
    private class RoleStateMemento implements Memento {

        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

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
    }
}
