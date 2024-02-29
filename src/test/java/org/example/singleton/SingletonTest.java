package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SingletonTest {

    @Test
    void 싱글톤_테스트_inner(){
        // innerclass로 싱글톤 생성
        TestInstance testInstance = TestInstance.getInstance();
        TestInstance testInstance2 = TestInstance.getInstance();

        assertThat(testInstance).isEqualTo(testInstance2);
        //System.out.println("inner class sington : " + (testInstance == testInstance2));
    }

    @Test
    void 싱글톤_테스트_enum(){
        // enum class로 싱글톤 생성(리플렉션에 안전하지만 클래스를 로딩하는 순간 생성되는 단점이 있음)
        TestInstanceEnum testInstanceEnum = TestInstanceEnum.INSTANCE;
        TestInstanceEnum testInstanceEnum2 = TestInstanceEnum.INSTANCE;

        assertThat(testInstanceEnum).isEqualTo(testInstanceEnum2);
        //System.out.println("enum class sington : " + (testInstanceEnum == testInstanceEnum2));
    }

}