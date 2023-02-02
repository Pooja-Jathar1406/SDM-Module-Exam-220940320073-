import java.util.Scanner;

class Searching {
    public static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found at index: " + i);
                ;
            }
        }
    }

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String a[]) {
        int[] a1 = { 10, 20, 30, 50, 70, 90 };
        int key = 50;
        int last = a1.length - 1;
        System.out.println("Enter your choice : \n 1.Linear search \n 2.Binary search");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                linearSearch(a1, key);
                break;
            case 2:
                binarySearch(a1, 0, last, key);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();

    }
}