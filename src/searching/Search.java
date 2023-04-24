package searching;

public class Search {

    public static int binarySearch(int[] array, int searchValue) {
        int low = 0;
        int high = array.length - 1;

        //loop while low and high are in order
        while (low <= high) {
            //get our mid-point
            int mid = (low + high) / 2;
            if (array[mid] == searchValue) {
                return mid;
            } else if (array[mid] > searchValue) {
                high = mid - 1;
            } else { //mid < value
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int searchValue) {
        int low = 0;
        int high = array.length - 1;

        return recursiveBinarySearch(array, searchValue, low, high);

        //loop while low and high are in order
//        while(low <=high){
//            //get our mid-point
//            int mid = (low + high) / 2;
//            if(array[mid] == searchValue) {
//                return mid;
//            }else if(array[mid] > searchValue){
//                high = mid - 1;
//            }else{ //mid < value
//                low = mid + 1;
//            }
//        }
//        return -1;
    }

    private static int recursiveBinarySearch(int[] array, int searchValue, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == searchValue) {
            return mid;
        } else if (array[mid] > searchValue) {
            return recursiveBinarySearch(array, searchValue, low, mid - 1);
        } else { //mid < value
            return recursiveBinarySearch(array, searchValue, mid + 1, high);
        }
    }

}