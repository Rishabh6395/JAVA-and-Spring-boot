#include<iostream>
#include<vector>
using namespace std;


int main(){

    int arr[5] = {1,9,-7,8,4};
    int prefix[5];

    prefix[0] = arr[0];
    for(int i =1; i< 5; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }

    // suffix
    int suffix[5];
    suffix[5-1] = arr[5-1];

    for(int i = 5-2; i>=0; i--){
        suffix[i] = suffix[i+1] + arr[i];
    }


    
    // printing the array;
    for(int i = 0; i<5; i++){
        cout<<suffix[i]<< ",";
    }
    return 0;
}