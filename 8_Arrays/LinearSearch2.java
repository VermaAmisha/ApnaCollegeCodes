public class LinearSearch2 {
    public static void main(String[] args) {
        int array[] = {20 , 40 , 60 , 80 , 100 , 120 , 140 , 160};
        int num = 100;
        int index = LinearSearchFunc(array, num);

        if(index == -1) {
            System.out.println("The number does not exist");
        }
        else {
            System.out.println("The index number is: " + index);
        }
        
    }

    public static int LinearSearchFunc(int array[] , int num) {
        for(int i = 0 ; i < array.length; i++) {
            if(array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
