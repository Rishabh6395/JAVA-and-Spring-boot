// Merge 2 sorted array;

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void moveZeros(int arr[], int n){
    int i =0;
    for(int j =0; j<n; j++){
        if(arr[j] != 0){
            swap(arr[j], arr[i]);
            i++;
        }
    }
}

void print(int arr[], int n){
    for(int i =0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


int main(){

    int arr[8] = {1,0,4,3,0,0,0};

    moveZeros(arr, 8);
    print(arr, 8);

    return 0;
}