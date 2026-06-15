// find the square root of the given number with BS;

#include<iostream>
#include<vector>
using namespace std;

int findSquareRoot(int n){
    int start = 0;
    int end = n;
    int mid = start + (end - start) /2;
    int ans = -1;

    while(start<=end){
        if(mid*mid == n){
            return mid;
        }
        else if(mid *mid < n){
            ans =  mid;
            start = mid + 1;
        }
        else if(mid*mid > n){
            end = mid -1;
        }
        mid = start + (end - start) /2;
    }
    return ans;
}

int main(){

    int a = 16;
    cout<<"Square root of " << a << " is: "<< findSquareRoot(a)<<endl;

    return 0;
}