package facade;

public class SmartFacade {

    // 聚合子系统的对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    // 赋值
    public SmartFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 打开功能
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    // 关闭功能
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    // 语音控制
    public void say(String message) {
        if(message.contains("打开")) {
            on();
        }else if(message.contains("关闭")) {
            off();
        }else {
            System.out.println("无法识别");
        }
    }
}
