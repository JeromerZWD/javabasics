package com.ecjtu.zwd.day18.map;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 *
 * 1：购置新牌
 * 		ArrayList<String>  colors:花色♥♠♣♦
 * 		ArrayList<String>  numbers：按照从小到大的顺序放置元素3-10,J,Q,K,A,2
 * 		ArrayList<String>   list  就是一副牌：每一个元素就是一张牌
 *
 * 2：洗牌
 * 		打乱牌的顺序    shuffle()
 * 3：发牌
 * 		先将最后三张发给底牌。
 * 		对3取模，余1发给第一个玩家，余2发给第二个玩家，剩下的发给第三个玩家。
 * 		ArrayList<String> player
 * 		ArrayList<String> player2
 * 		ArrayList<String> player3
 * 		ArrayList<String> dipai
 * 4：看牌
 * 		迭代集合
 */
public class PlayGame {
    public static void main(String[] args) {
        // 1：购置新牌
        // 准备花色
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");

        // 准备数字
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        // 完成新牌
        ArrayList<String> cards = new ArrayList<>();
       // 迭代花色
        for (String color : colors) {
            // 迭代数字
            for (String number : numbers) {
                // 通过花色数字组成一张牌
                String card = color + number;
                // 组成一张牌，就放置一张牌
                cards.add(card);
            }
        }

        // 加入大小王
        cards.add("小☺");
        cards.add("大☻");
        System.out.println(cards);

        // 2：洗牌
        Collections.shuffle(cards);
        System.out.println(cards);

        // 3：发牌
        // 准备玩家
        ArrayList<String> player = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        // 使用普通的for循环，通过索引操作牌
        for (int i = 0; i < cards.size(); i++) {
            // 将最后三张给底牌
            if (i >= 51) {
                dipai.add(cards.get(i));
            } else {
                // 根据模与3的余数判断给哪位玩家发牌
                if (i % 3 == 1) {
                    player.add(cards.get(i));
                } else if (i % 3 == 2) {
                    player2.add(cards.get(i));
                } else {
                    player3.add(cards.get(i));
                }
            }
        }
        // 4：看牌
        System.out.println(player);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
