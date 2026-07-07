#include<iostream>
#include<vector>
using namespace std;

bool checkPalindrom(char a[], int n){

    int s=0;
    int e = n-1;

    while(s<e){
        if(a[s] != a[e]){
            return 0;
        }
        else{
            s++;
            e--;
        }
    }
    return 1;

}

int main(){

    char check[20];
    cin>>check;
    cout<<"Palindrom or Not: "<<checkPalindrom(check, 5)<<endl;

    return 0;
}