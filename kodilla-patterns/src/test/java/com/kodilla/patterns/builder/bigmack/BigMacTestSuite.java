package com.kodilla.patterns.builder.bigmack;

import com.kodilla.patterns.builder.bigmac.BigMack;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMackNew() {
        //Given
        BigMack bigMack = new BigMack.BigMackBuilder().bun("Bun with sesame seeds").burgers(2).sauce("spicy")
                .ingredient("salad").ingredient("cheese").ingredient("cucumber")
                .ingredient("anion").ingredient("tomato").build();
        System.out.println(bigMack);
        //When
        int howManyIngredients = bigMack.getIngredients().size();
        String sauces = bigMack.getSauce();
        int burgers = bigMack.getBurgers();
        String buns = bigMack.getBun();

        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("spicy", sauces);
        Assert.assertEquals(2, burgers);
        Assert.assertNotEquals("Bun without sesame", buns);
    }
}
