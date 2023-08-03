package projeto1;

public class d1 {

 

    public static void main(String[] args) {

        

        System.out.println(  somar(2,3) + " " + somar(4,8) + " " + somar(7,10));

        System.out.println(  subt(2,3) + " " + subt(4,8) + " " + subt(7,10));

        System.out.println(  multi(2,3) + " " + multi(4,8) + " " + multi(7,10));

        System.out.println(  divid(2,3) + " " + divid(4,8) + " " + divid(7,10));

    }

    

    private static float somar(float a, float b) {

        float rsltd = a + b;

        return rsltd;

 

    }

    private static float multi(float a, float b) {

        float rsltd = a * b;

        return rsltd;

 

    }

    private static float subt(float a, float b) {

        float rsltd = a - b;

        return rsltd;

 

    }

    private static float divid(float a, float b) {

        float rsltd = a /b;

        return rsltd;

 

    }

}