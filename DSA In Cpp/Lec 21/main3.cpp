#include<iostream>
#include<vector>
using namespace std;

char getMaxOccurance(string s){

    // test => o/p -> t

    int arr[26] = {0};

    // create an array of count of char.
    for(int i =0; i<s.length(); i++){
        // lower
        int num = 0; 
        char ch = s[i];

        // lower
        if(ch>='a' && ch<='z'){
            num = ch - 'a';
        }
        else{ // uppercase
            num = ch - 'A';
        }
        arr[num]++;
    }
    int maxi = -1, ans =0;
    for(int i =0; i<26; i++){
        if(maxi < arr[i]){
            ans = i;
            maxi = arr[i];
        }
    }
    char final = 'a'+ans;
    return final;
}

int main(){

    string s;
    cout<<"enter string"<<endl;
    cin>>s;
    cout<<getMaxOccurance(s)<<endl;

    // char a;
    // cin>>a;
    // cout<<'z' - a;


    return 0;
}