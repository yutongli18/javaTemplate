package innerclass_singleton;

public class InnerClassSingletonTest {
    public static void main(String[] args){

    }
}

class InnerClassSingleton{
    private static class InnerClassSingletonHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){

    }
    public static InnerClassSingleton getInstance(){
        return InnerClassSingletonHolder.instance;
    }
}
