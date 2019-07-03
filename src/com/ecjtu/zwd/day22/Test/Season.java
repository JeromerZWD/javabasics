package com.ecjtu.zwd.day22.Test;

public enum Season {
    Spring("春天","春暖花开"),
    Summer("夏天","夏日炎炎"),
    Autumn("秋天","硕果累累"),
    Winter("冬天","白雪皑皑");

    private final  String name;
    private final  String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
