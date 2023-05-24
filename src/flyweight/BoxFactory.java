package flyweight;


import java.util.HashMap;

public class BoxFactory {

    private static BoxFactory boxFactory;

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public AbstractBox getBox(String boxName) {
        return map.get(boxName);
    }

    public static BoxFactory getInstance() {
        boxFactory = new BoxFactory();
        return boxFactory;
    }
}
