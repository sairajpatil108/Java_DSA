
public class numbers {
    public static void main(String[] args) {
        int a = 1000000000;
        byte b = 12;
        float c = 10.4f;
        boolean result;

        result = a > 10 ? true : false;

        switch (a) {
            case 100:

                break;
            default:
                break;
        }
        int x = a > 10 ? 10 : 20;

        System.out.println(result);

        Innernumbers in = new Innernumbers();
        in.add();

    }
}

class Innernumbers {

    private int c = 10;
    private int d = 20;

    void add() {
        int e = c + d;
        System.out.println(e);
    }
}


