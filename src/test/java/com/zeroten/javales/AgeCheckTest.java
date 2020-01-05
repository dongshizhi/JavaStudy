package com.zeroten.javales;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.zeroten.javales.AgeCheck.getAgeName;

public class AgeCheckTest {

////|年龄范围    |描述         |
////|-----------|------------|
////|0 ~ 6岁     |儿童 |
////|7 ~ 17岁    |少年 |
////|18 ~ 40岁   |青年 |
////|41 ~ 59岁   |中年 |
////|60及以上     |老年 |
    //String AgeCheckTest.getAgeName(int age)  //函数的作用就是传一个参数年龄，返回结果为字符串
    @Test
    public void testAgeCheck1() {
        //given 输入条件
        Assert.assertEquals(getAgeName(6),"儿童");
        Assert.assertEquals(getAgeName(7), "少年");
        Assert.assertEquals(getAgeName(20), "青年");
    }

    @Test
    public void testAgeCheck2(){
        Assert.assertEquals(getAgeName(45),"中年");
        Assert.assertEquals(getAgeName(60),"老年");
        Assert.assertEquals(getAgeName(80),"老年");
        //when当什么情况输出什么结果
    }
        //then 进行判断
}

