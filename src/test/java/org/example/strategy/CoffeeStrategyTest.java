package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CoffeeStrategyTest {

    @Test
    void 전략패턴_커피주문하기(){
        Order orderAffogato = new Order(new Affogato());
        Coffee affogato = orderAffogato.order("아포가토");

        printAndAssert(affogato, "아포가토", "케냐", "ice");

        Order orderColdBrew = new Order(new ColdBrew());
        Coffee coldBrew = orderColdBrew.order("콜드브루");

        printAndAssert(coldBrew, "콜드브루", "브라질", "ice");

        Order orderFlatWhite = new Order(new FlatWhite());
        Coffee flatWhite = orderFlatWhite.order("플랫화이트");

        printAndAssert(flatWhite, "플랫화이트", "에티오피아", "hot");

    }
    private static void printAndAssert(Coffee coffee, String type, String beans, String hotIce) {
        System.out.println(coffee);
        assertThat(coffee.getType()).isEqualTo(type);
        assertThat(coffee.getBeans()).isEqualTo(beans);
        assertThat(coffee.getHotIce()).isEqualTo(hotIce);
    }


}