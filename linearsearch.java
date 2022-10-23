import java.util.Scanner;

class Linearsearch {

    /**
     * @param arr
     * @param x
     * @return
     */
    public static int search(int[] arr, int x) {
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                b = i;

        }
        return b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements in the array");
        int N = sc.nextInt();

        int[] a = new int[N];
        System.out.println("enter array elements");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("enter target element");
        int t = sc.nextInt();

        int ans = search(a, t);

        System.out.println(ans);
    }
}