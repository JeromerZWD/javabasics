package com.ecjtu.zwd.day18.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 经典面试题:获取字符串中的每种字符，以及每种字符出现的次数
 *
 * 打印结果：a(1) b(2) c(3)...
 * 思路： 对于结果的分析发现，字母和次数之间存在着映射的关系。而且这种关系好多。
 * 好多酒需要存储，能存储映射关系的容器有数组和Map集合。 关系一方是有序编号吗？ 没有
 * 那就是使用Map集合。又发现可以保证唯一性的一方的一方具备着顺序如a b c。。。 所以可以使用TreeMap集合。
 *
 * 这个集合最终应该存储的是字母和次数的对应关系。
 *
 * 1.因为操作的是字符串中的字母，所以先将字符串变成字符数组。
 * 2.遍历字符数组，用每一个字母作为键去查Map集合这个表。
 * 如果字母键不存在，就将该字母作为键，
 * 1作为值存储到map集合中 如果该字母键存在，就将该字母键对应值取出并+1，
 * 在将该字母和+1后的值存储到map集合中
 * 键相同，值会覆盖。这样就记录住了该字母的次数
 *  * 3.遍历结束。map集合就记录所有字母的出现次数。
 *
 */
public class GetCharCountWithMap {
    public static void main(String[] args) {
        String str = "fdgavAdebs5dDadfgjkdgasxbccxvvcxn1bnb-dfs";
        String s = getCharCount(str);
        System.out.println(s);
    }

    private static String getCharCount(String str) {
        // 将字符串转化成字符数组
        char[] chs = str.toCharArray();
        // 定义map集合表
        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        for (int i = 0; i < chs.length; i++) {
            // if (!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i] <='Z'))
            if (!(Character.toLowerCase(chs[i]) >= 'a' && Character.toLowerCase(chs[i]) <= 'z'))
                continue;

            // 将数组中的字母作为键去查map表。
            Integer value = map.get(chs[i]);

            int count = 1;
            //如果查找的字符的次数不为1，则在原来的次数加1，否则赋值为1
            if (value != null) {
                count = value + 1;
            }
            map.put(chs[i], count);
        }

        return mapToString(map);
    }

    private static String mapToString(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character key = it.next();
            Integer value = map.get(key);
            sb.append(key + "(" + value + ")" + " ");
        }
        return sb.toString();

    }

}
