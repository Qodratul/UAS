package Data;

public class Metode {

    public String getUrutanAngka() {
        StringBuilder result = new StringBuilder();
        int total = 0;
        int currentValue = 1;

        for (int i = 0; i < 50; i++) {
            result.append(currentValue).append("\n");
            total += currentValue;
            currentValue += 2;
        }
        return result.toString();
    }

    public int getTotalJumlah(){
        int total = 0;
        for (int i = 1; i <= 100; i += 2) {
            total += i;
        }
        return total;
    }
}
