package quizer.enitity;

public class TrueFalse extends Numeric {

    private String optionTrue;
    private String optionFalse;

    public void setOptionTrue(String optionTrue) {
        this.optionTrue = optionTrue;
    }

    public String getOptionTrue(){
        return optionTrue;
    }

    public void setOptionFalse(String optionFalse) {
        this.optionFalse = optionFalse;
    }

    public String getOptionFalse(){
        return optionFalse;
    }

}
