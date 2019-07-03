package com.ecjtu.zwd.day4;

public class Master {
    public void feed(Pet p){
        p.eat();
    }
    public void play (Pet pet){
        if (pet instanceof Dog) {    //如果传入的是狗狗
            Dog dog = (Dog) pet;
            dog.catchingFlyDisc();
        }else if (pet instanceof penguin) {   //如果传入的是企鹅
            penguin pgn = (penguin) pet;
            pgn.swimming();
        }
    }
    public Pet getPet(int typeId){
        if (typeId==1){
            return new Dog(5,5,1);
        }else if (typeId==2){
            return new Cat(5,5,2);
        }else if(typeId==3){
            return new penguin(5,5,3);
        }else {
            return new Pet(0,0,0);
        }

    }
}
