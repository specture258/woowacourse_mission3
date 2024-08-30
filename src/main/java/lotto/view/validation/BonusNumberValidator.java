package lotto.view.validation;

public class BonusNumberValidator implements Validator {
    @Override
    public boolean validate(String input) {
        validateInteger(input);
        validateBlank(input);
        return true;
    }

    void validateInteger(String value) throws IllegalArgumentException{
        boolean isDigit = value.chars()
                .allMatch(Character::isDigit);
        if(!isDigit){
            Validator.throwError("보너스 번호가 숫자가 아닙니다");
        }
    }

    void validateBlank(String value) throws IllegalArgumentException{
        final String BLANK = "";
        if(BLANK.equals(value.trim())){
            Validator.throwError("보너스 번호가 없습니다");
        }
    }
}
