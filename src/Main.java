import searching.Search;

public class Main {
    public static void main(String[] args) {
        int[] array = {-5, 0, 1, 3, 5, 7, 8, 9, 10, 15, 16, 18, 19, 25, 29, 35, 42};
        int[] searches = {-6, -5, 0, 7, 42, 50};

        for (int i = 0; i < searches.length; i++) {
            System.out.println("search for : " + searches[i] +" : " + Search.binarySearch(array, searches[i]));
        }

        System.out.println(System.lineSeparator());

        for (int i = 0; i < searches.length; i++) {
            System.out.println("search for : " + searches[i] +" : " + Search.recursiveBinarySearch(array, searches[i]));
        }
    }
}