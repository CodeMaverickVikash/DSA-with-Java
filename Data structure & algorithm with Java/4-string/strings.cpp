#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string formBiggestNumber(string str) {
    sort(str.begin(), str.end(), greater<int>());
    return str;
}

int main() {
    // string str = "viksh";
    // string str(10); // string with 10 size
    // string str(5, 'N'); // string of 5 size with all characters N
    // string abc(str); // copy of str
    
    // Taking input string
    // string str;
    // cin >> str;
    // getline(cin, str);
    // cout << str;

    // concatenation
    // string s1 = "Fam";
    // string s2 = "illy";
    // // s1.append(s2);
    // s1 += s2;
    // cout << s1;

    // Accessing element of string
    // str.clear();
    // cout << str[0];

    // Compare two string
    // string s1 = "abc";
    // string s2 = "xyz";

    // if(s1.compare(s2) == 0) {
    //     cout << "Strings are equal";
    // }
    // if(s1.compare(s2) > 0) {
    //     cout << "Strings are s1 greater than s2 ";
    // }
    // else {
    //     cout << "Strings are s1 lesser than s2 ";
    // }

    // if(!s1.empty()) {
    //     cout << "String is not empty";
    // }

    // string s = "Hello vikash";

    // s.erase(0, 3);
    // cout << s << endl;

    // cout << s.find("llo") << endl;
    // s.insert(0, "Mic");
    // cout << s << endl;
    // cout << s.length() << endl;
    // cout << s.substr(0, 3) << endl;

    // string s = "789";
    // int num = stoi(s);
    // cout << num+2 << endl;
    // int n = 456;
    // cout << to_string(n)+"2" << endl;

    // string s2 = "Vikash";
    // string s2 = "546";
    // sort(s2.begin(), s2.end());
    // transform(s2.begin(), s2.end(), s2.begin(), ::toupper);
    // transform(s2.begin(), s2.end(), s2.begin(), ::tolower);
    // cout << s2 << endl;

    // string str = "53214";
    // cout << formBiggestNumber(str) << endl;

    // Maximum frequency of character
    string s = "abcacbade";

    return 0;
}