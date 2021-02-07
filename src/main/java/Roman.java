public enum Roman {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7),
    VIII("VIII", 8), IX("IX", 9), X("X", 10), XX("XX", 20), XXX("XXX", 30),
    XL("XL", 40), L("L", 50), LX("LX", 60), LXX("LXX", 70), LXXX("LXXX", 80),
    XC("XC", 90), C("C", 100);

    private int value;
    private String key;

    Roman(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public String getKey() {
        return key;
    }
}
