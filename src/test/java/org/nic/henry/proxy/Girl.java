package org.nic.henry.proxy;

public class Girl implements Person{

    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void findLove() {
        System.out.println("My name:"+name+",age=" + age);
    }
}
