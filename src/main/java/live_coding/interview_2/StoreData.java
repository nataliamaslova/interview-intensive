package live_coding.interview_2;

public class StoreData {
    private String key;
    private Employee value;

    public StoreData(String key, Employee value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Employee getValue() {
        return value;
    }
}
