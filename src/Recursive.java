public class Recursive {

    public Recursive(){

    }
    public static Integer Unknown(Integer X, Integer Y){
        if(X < Y){
            System.out.println(X+Y);
            return (Unknown(X + 1, Y) * 2);
        } else if (X.equals(Y)) {
            return 1;
        }else{
            System.out.println(X + Y);
            return(Unknown(X - 1, Y)/2);
        }
    }

    public static Integer IterativeUnknown(Integer X, Integer Y){

        if(X.equals(Y)){
            return 1;
        }

        int A = Y - X;

        if(X < Y){
            while(!X.equals(Y)) {
                System.out.println(X + Y);
                X++;
            }
            int Z = 2;
            for (int i = 1; i < A; i++) {
                Z = Z * 2;
            }
            return Z;
        }else {
            while(!X.equals(Y)) {
                System.out.println(X + Y);
                X--;
            }
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println("X = " + 10 + " and Y = " + 15);
        System.out.println(IterativeUnknown(10,15));
        System.out.println();

        System.out.println("X = " + 10 + " and Y = " + 10);
        System.out.println(IterativeUnknown(10,10));
        System.out.println();


        System.out.println("X = " + 15 + " and Y = " + 10);
        System.out.println(IterativeUnknown(15,10));

    }
}
