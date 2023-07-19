package hw_july17.variables;

public class Types {
    public static void main(String[] args) {
//        types of variables
        byte size1 = 8;
        int size2 = 32;
        float size3 = 32.01234F;
        double size4 = 64.012345;
//        file extension
        byte increase1 = ++ size1;
        int increase2 = size1 * size2;
        float increase3 = size1 + size3;
        double increase4 = size1 + size4;
//        file narrowing
        float decrease1 = (float)size4;
        int decrease2 = (int)size3;
        byte decrease3 = (byte)size2 ++;
        byte decrease4 = (byte)size1 ++;
        System.out.println();
        System.out.println(increase1);
        System.out.println(increase2);
        System.out.println(increase3);
        System.out.println(increase4);
        System.out.println();
        System.out.println(decrease1);
        System.out.println(decrease2);
        System.out.println(decrease3);
        System.out.println(decrease4);
    }
}
