package object;

public class Main {

    public static void main(String[] args) {
        SingeObject.INSTANCE.printHello();

        String[] strings = {"hello","chen", "qiao"};
        for (String s : strings){
            System.out.println(s);
        }


        System.out.println(" ----------------------");

        String s = "a_b_c_d_e_f_g_h";
        System.out.println(s);
        System.out.println("------------------------");
        String[] splits = s.split("_");
        for (String sss:splits){
            System.out.print(sss);
            System.out.print(" ");
        }



        User user = new User();
    }



}
