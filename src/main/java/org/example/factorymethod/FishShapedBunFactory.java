package org.example.factorymethod;

public interface FishShapedBunFactory {
    default FishShapedBun orderBun(String name, String flavor, int amount){
        validate(flavor);
        prepare(flavor);
        make(amount);
        FishShapedBun fishShapedBun = createFishShapeBun(name, flavor, amount);
        notifyComplete(fishShapedBun);
        return fishShapedBun;
    }
    FishShapedBun createFishShapeBun(String name, String flavor, int amount);
    private void validate(String flavor){
        if(flavor == null){
            throw new IllegalArgumentException("맛을 정해 주세요!");
        }
    }

    private void prepare(String flavor) {
        System.out.println(flavor + " 맛 붕어빵 만들 준비 중");
    }

    private void make(int amount){
        for (int i = 1; i <= amount; i++) {
            System.out.println(i + "개 완성");
        }
    }

    private void notifyComplete(FishShapedBun fishShapedBun) {
        System.out.println(fishShapedBun.getName() + " 님 "+ fishShapedBun.getFlavor() + " 맛 붕어빵이 "+fishShapedBun.getAmount()+"개 완성 됐습니다");
    }

}
