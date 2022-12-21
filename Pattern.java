/******************* Ractangle ********************/
// class Pattern {
//     public static void main(String args[]) {
//         int row = 5, column = 4;
        
//         for(int i=0; i<row; i++) {
//             for(int j=0; j<column; j++) {
//                 System.out.print("* ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

/******************* Hollow Ractangle ********************/

// class Pattern {
//     public static void main(String args[]) {
//         int row = 5, col = 4;

//         for(int i=1; i<=row; i++) {
//             for(int j=1; j<=col; j++) {
//                 if(i==1 || i==row) {
//                     System.out.print("*");
//                 }
//                 else if(j==1 || j==col) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }

/******************* Downward Triangle Star Pattern ********************/

// class Pattern {
//     public static void main(String args[]) {
//         int row=5, col=4;

//         for(int i=row; i>0; i--) {
//             for(int j=i; j>0; j--) {
//                 System.out.print("* ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

/******************* Left Triangle Star Pattern ********************/

// class Pattern {
//     public static void main(String args[]) {
//         int n=5;

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n; j++) {
//                 if(j<=(n-i))
//                     System.out.print("  ");
//                 else {
//                     System.out.print("* ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }

// SOLUTION
// class Pattern {
//     public static void main(String ar[]) {
//         int n=5;

//         int num=1;
//         for(int i=1; i<=n; i++ ) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(num+" ");
//             }
//             System.out.print("\n");
//             num++;
//         }
//     }
// }

// class Pattern {
//     public static void main(String ar[]) {
//         int n=5;

//         for(int i=n; i>0; i--) {
//             int num=1;
//             for(int j=1; j<=i; j++) {
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.print("\n");
//         }
//     }
// }

class Pattern {
    public static void main(String ar[]) {
        int n=5;

        int num=1;
        for(int i=1; i<=n; i++ ) {
            for(int j=1; j<=i; j++) {
                if(((i+j)%2)==0) {
                    System.out.print("1 ");
                }
                else 
                    System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }
}