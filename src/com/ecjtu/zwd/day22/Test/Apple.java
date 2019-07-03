package com.ecjtu.zwd.day22.Test;

public class Apple {
    @FruitName(name="好苹果")
    private String name;
    @FruitColor(color="青色")
    private String color;
    @FruitProvider(provider = "北京")
    private String provider;

    public Apple() { }
@FruitName(name ="苹果2") @FruitColor(color = "红色") @FruitProvider(provider = "冰糖心")
    public Apple(String name, String color, String provider) {
        this.name = name;
        this.color = color;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
