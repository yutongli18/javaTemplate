package interpreter;

import java.util.HashMap;
import java.util.Map;

// 环境角色
public class Context {

    private Map<Variable, Integer> variableList = new HashMap<>();

    // 添加变量
    public void assign(Variable variable, Integer value) {
        variableList.put(variable, value);
    }

    // 获取变量的值
    public int getValue(Variable variable) {
        return variableList.get(variable);
    }
}
