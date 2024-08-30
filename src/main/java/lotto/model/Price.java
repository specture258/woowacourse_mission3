package lotto.model;

import lotto.view.PriceNumberInputView;

public class Price {

    int price;

    private final PriceNumberInputView priceNumberInputView;

    public Price(PriceNumberInputView priceNumberInputView) {
        this.priceNumberInputView = priceNumberInputView;
    }

    public void createPrice(){
        String input = priceNumberInputView.inputPrice();
        this.price = Integer.parseInt(input);
    }

    public int getPrice() {
        return price;
    }
}
