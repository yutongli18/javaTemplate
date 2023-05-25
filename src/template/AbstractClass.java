package template;

public abstract class AbstractClass {

    // 定义模板方法
    // 子类不能改变模板方法定义的算法骨架，用final修饰
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 定义基本方法
    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }
}
