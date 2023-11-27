public class Intro {
    public static void main(String[] args) {
        
        // collection of same type of data.
        // Syantax : datatype[] VarieableName = new datatype[size];

        int[] rollNo = new int[5];
        System.out.println(rollNo[1]); // It gives 0

        String[] names = new String[5];
        System.out.println(names[2]); // It returns null

        float[] nos = new float[5];
        System.out.println(nos[1]); // It returns 0.0

        // rollNo - this reference varieable pointing to an array object ( new int[5] )contains integer type element.
        // If we don't mention the size it would give error.

        // Lets Break down the step.
        // int[] rollNo; : decleration of array, rollNo is getting defined in the stack.
        // rollNo = new int[5] : Initialization, Actually here object is being created in the memory (heap).

        // or
        int[] rollno = {1,2,3,4,5};

    }
}
