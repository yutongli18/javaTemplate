package combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    // 菜单可以有多个子菜单和子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    // 构造方法

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i ++) {
            System.out.print("-");
        }
        // 打印菜单名称
        System.out.println(name);
        // 打印子菜单和子菜单项的名称
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
