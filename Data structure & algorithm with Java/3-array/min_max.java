class min_max {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 8};
        
        int min = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        
        System.out.print(min + " "+ max);
    }
}