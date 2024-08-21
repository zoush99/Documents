// 引入 HashMap 类      
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TryHashMap {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        Set<Integer> set = new HashSet<>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        set.add(1);
        set.add(2);
        set.remove(1);
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
        for(Integer i:set){
            System.out.print(i + ", ");
        }
    }
}