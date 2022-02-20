// #include <iostream>
// using namespace std;

// int main() {
//     string str;
//     int a, b;

//     cin>>str>>a>>b;

//     char c = str[b-1];
//     str[b-1] = str[a-1];
//     str[a-1] = c;

//     cout<<str;
// }

// #include <iostream>
// using namespace std;

// int main() {
//     int N, M;

//     cin>>N>>M;

//     string S[N]; 
//     string T[M]; 
//     for(int i=0; i<N; i++) {
//         string str;
//         cin>>str;
//         S[i] = str;
//     }

//     for(int i=0; i<M; i++) {
//         string str;
//         cin>>str;
//         T[i] = str;
//     }

//     string temp[N];
//     for(int i=0; i<N; i++) {
//         temp[i] = "No";
//     }

//     for(int i=0; i<M; i++) {
//         for(int j=0; j<N; j++) {
//             if(T[i] == S[j]) {
//                 temp[j] = "Yes";
//                 break;
//             }
//         }
//     }

//     for(int i=0; i<N; i++) {
//         cout<<temp[i]<<"\n";
//     }

//     return 0;
// }

// #include <iostream>
// using namespace std;

// int main() {
//     int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

//     int sum = 0, lSumOfSubArray=0;
//     for(int i=0; i<8; i++) {
//         sum += arr[i];
//         if(sum>lSumOfSubArray) {
//             lSumOfSubArray = sum;
//         }
//     }

//     cout<<lSumOfSubArray;

//     return 0;
// }

#include<bits/stdc++.h>
using namespace std;
int main(){

    int arr[] = {10, 67, 89, 78, 34, 2, 95};
    int n = sizeof(arr)/sizeof(arr[0]);

    int smallest = INT_MAX, largest = INT_MIN;
   
    for(int i=0; i<n; i++) {
       if(smallest > arr[i])
         smallest = arr[i];
       if(largest < arr[i])
         largest = arr[i];
    }

   cout<<smallest<<endl<<largest;
}