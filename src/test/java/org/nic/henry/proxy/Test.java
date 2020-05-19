package org.nic.henry.proxy;

public class Test {

    public static void main(String[] args) {
        Girl girl = new Girl("lily", 18);
        MeiPo meiPo = new MeiPo();
        Person instance = (Person) meiPo.getInstance(girl);
        instance.findLove();
    }
}
