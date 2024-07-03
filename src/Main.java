public class Main {
    public static void main(String[] args) {
        System.out.println();

        int variable = 2;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable = 9;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable = 17;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable =88;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        int variable2 = 150;


        System.out.println("Gimme space");
        int x  = 150;
        System.out.println(Integer.toBinaryString(x));
        x =  x >> 2;
        System.out.println(Integer.toBinaryString(x));
        //anticpate to do the oppisite of the left shift operator

        x = 225;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));

        x = 1555;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));


        x = 32456;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));









    }
}