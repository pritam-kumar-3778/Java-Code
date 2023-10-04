public class TypePromotion {
    public static void main(String[] args) {
        int num = 257;
        byte no = (byte)num; // 257 % 256 = 1
        System.out.println(no);  // It gives 1 because the max value of yte is 256 so we can't store the above.


        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b /c;
        System.out.println(d);
// The result of a * b is 2000 .It exceed the range of byte i.e 256 but java automatically promote these to int at the time of rvaulating expression.
// All the byte,short and char value are promoted to integer.
// Any one of the operand is long the whole operation is promoted to long.
// Any one of the operand is float the whole operation is promoted to float.
// Any one of the operand is double the whole operation is promoted to double.
        System.out.println(3 * 5.6); //16.799999999999997
    }
}
