package combination;

public abstract class MenuComponent {

    protected String name;
    protected int level;

    // 添加子菜单
    public void add(MenuComponent component) {
        // 菜单项没有子菜单和子菜单项，不能移除
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单名称
    // 菜单和菜单项的打印方法不同
    public abstract void print();
}
