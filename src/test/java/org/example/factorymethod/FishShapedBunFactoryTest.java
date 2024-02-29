package org.example.factorymethod;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FishShapedBunFactoryTest {
    @Test
    void 팩토리메서드_손님_주문하기(){
        RedBeanFlavorFactory redBeanFlavorFactory = new RedBeanFlavorFactory();
        CustardCreamFlavorFactory custardCreamFlavorFactory = new CustardCreamFlavorFactory();

        Order order1 = new Order();
        Order order2 = new Order();

        order1.orders(redBeanFlavorFactory, "예영", "팥", 4);
        order2.orders(custardCreamFlavorFactory,"hai", "슈크림", 10);

        assertThat(order1).isNotNull();
        assertThat(order2).isNotNull();
        assertThat(order1).isNotEqualTo(order2);
    }
}