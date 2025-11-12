
// public class practice {
//     void maxOftwo(int arr[]) {
//         int max = Integer.MIN_VALUE;
//         int max1 = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             max = Math.max(max, arr[i]);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != max) {
//                 max1 = Math.max(max1, arr[i]);
//             }
//         }
//         System.out.println(max + max1);
//     }
//     void bestdish(int K, int N, int arr[]) {
//         int result = 0;
//         for (int i = 0; i < N; i++) {
//             if (arr[i] == K) {
//                 result++;
//             }
//             for (int j = i + 1; j < N; j++) {
//                 if (arr[i] + arr[j] == K) {
//                     result++;
//                 }
//             }
//         }
//         System.out.println(result);
//     }
public class complex {

    int real;
    int img;

    complex(int i, int j) {
        real = i;
        img = j;
    }

    public static complex add(complex a, complex b) {
        return new complex((a.real + b.real), (a.img + b.img));
    }

    void print() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (real != 0 && img == 0) {
            System.out.println(real);

        } else {
            System.out.println(real + "+" + img + "i");

        }
    }

    public static void main(String[] args) {

        complex a1 = new complex(2, 3);
        complex b1 = new complex(5, 9);

        complex c = complex.add(a1, b1);
        c.print();

    }
}
