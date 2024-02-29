package org.example.builder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaBuilderTest {
    @Test
    void 피자_만들기_빌더테스트() {
        PizzaDirector director = new PizzaDirector(new BasicPizzaBuilder());
        Pizza pepperoniPizza = director.pepperoni();
        Pizza halfPizza = director.halfPizza();

        Assertions.assertThat(pepperoniPizza).isNotNull();
        Assertions.assertThat(pepperoniPizza.getType())
                .isEqualTo("페퍼로니 피자");
        Assertions.assertThat(halfPizza).isNotNull();
        Assertions.assertThat(halfPizza.getType())
                .isEqualTo("하프 앤 하프 피자");
    }

}