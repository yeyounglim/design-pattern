package org.example.singleton;

public class TestInstance {

    private TestInstance() {
    }

    public static TestInstance getInstance() {
        return TestInstanceHolder.INSTANCE;
    }

    private static class TestInstanceHolder {
        private static final TestInstance INSTANCE = new TestInstance();
    }
}
