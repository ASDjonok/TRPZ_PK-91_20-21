public class Lab1 {
    public static void main(String[] args) {
        float a = 0.1f;
        float n = 0.3f;
        int b = 1;
        int m = 20;
        int c = 1;

        double s = 0;
        for (float i = a; i < n; i += 0.1) {
            for (float j = b; j < m; j++) {
                s +=/* (double)*/ (i + j) / (i + c);
            }
        }

        System.out.println("S = " + s);
    }
}
