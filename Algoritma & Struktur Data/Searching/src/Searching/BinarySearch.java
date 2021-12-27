package Searching;

public class BinarySearch {

    int binarySearch(int data[], int awal, int akhir, int searchData) {
        if (akhir >= awal) {
            int mid = awal + (akhir - awal) / 2;

            if (data[mid] == searchData)
                return mid;

            if (data[mid] > searchData)
                return binarySearch(data, awal, mid - 1, searchData);

            return binarySearch(data, mid + 1, akhir, searchData);
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();

        int[] data = {3, 9, 11, 12, 15, 17, 23, 31, 35};

        int n = data.length;
        int searchData = 23;
        int result = ob.binarySearch(data, 0, n - 1, searchData);
        if (result == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result);
    }
}
