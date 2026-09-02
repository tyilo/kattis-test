public class nsum {
    public static void main(String[] args) {
        var io = new Kattio(System.in, System.out);
        int n = io.getInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += io.getInt();

        }
        System.out.println(answer);
    }
}
