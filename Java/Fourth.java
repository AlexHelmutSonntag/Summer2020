import java.util.Arrays;

// This frile is from 53:23 till 1:01:55
// It's about arrays in java

public class Fourth {
    public static void main(String [] args) {
        // arrays are of type reference
        int [] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        // For all primitive types this method is implemented multiple times and we call that method overloading 
        System.out.println(numbers);//[I@74a10858
        System.out.println(Arrays.toString(numbers));//[0, 1, 2, 0, 0]
        
        int [] numbers1 = {2,3,11,8};
        System.out.println(numbers1.length);//4
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));//[2, 3, 8, 11]


        //Multi-Dimensional arrays
        int [][] matrix = new int [2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        System.out.println(Arrays.toString(matrix));//[[I@2698dc7, [I@43d7741f]
        System.out.println(Arrays.deepToString(matrix));//[[1, 2, 0], [0, 0, 0]]
        int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix1));//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]





    }
    
}