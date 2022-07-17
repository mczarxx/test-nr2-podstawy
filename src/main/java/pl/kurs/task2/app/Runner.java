package pl.kurs.task2.app;

public class Runner {
    public static void main(String[] args) {

        //StringBuilder
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(' ');
        }
        String numbers1 = sb.toString();
        long stop1 = System.nanoTime();

        //konkatenacja
        long start2 = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + ' ';
        }
        long stop2 = System.nanoTime();

        double result1 = stop1 - start1;//czas wykonania StringBuilder'a
        double result2 = stop2 - start2;//czas wykonania konkatenacji

        System.out.println(result2 / result1);
        System.out.println("StringBuilder szybszy od konkatenacji, bo w StringBuilderze powstaje tylko jeden\n" +
                "obiekt \"sb\" typu StringBulider, a w konkatenacji 2000 obiektow \"numbers2\" typu String.");
// powiedzmy, ale brakuje informacji o tym w jaki sposob pod spodem dziala append a w jaki +=,
// ze jeden dziala na zasadzie arrayListy i zwiekszania pojemnosci o 50% (co to jest pojemnosc a co to rozmiar?) a drugi po prostu tworzy miejsca tyle ile musi
    }
}
