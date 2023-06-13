// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.

public class task4 {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            s += "a";
            sb.append("a");
        }
        long startTime = System.currentTimeMillis();
        s = s.replaceAll("a", "А");
        long endTime = System.currentTimeMillis();
        System.out.println("Для String: " + (endTime - startTime) + " мс");
        startTime = System.currentTimeMillis();
        sb = new StringBuilder(sb.toString().replaceAll("a", "А"));
        endTime = System.currentTimeMillis();
        System.out.println("Для StringBuilder: " + (endTime - startTime) + " мс");
    }
}
