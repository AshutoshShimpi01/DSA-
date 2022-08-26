public class pract {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,1,2,1,2,3,4,5,1,3,4,2};

        int temp = 1;
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                count = Math.max(temp,count);
                temp = 1;
            }else {
                temp++;
            }
        }

        System.out.println(count);
    }
}

//5
