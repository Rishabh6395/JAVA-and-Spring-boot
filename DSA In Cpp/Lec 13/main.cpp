// First and last position of an element in sored array;

#include<iostream>
using namespace std;

int fistPosition(int arr[], int size, int k){

    int start = 0;
    int end = size -1;

    int mid = start + (end - start) / 2;
    int ans = -1;

    while(start<=end){
        
        if(arr[mid] == k){
            ans = mid;
            end = mid -1;
        }
        else if(k > arr[mid]){
            // right mai jao
            start = mid +1;
        }
        else if(k < arr[mid]){
            // left mai jao
            end = mid -1;
        }
        mid = start + (end - start) / 2;
    }

    return ans;
}

int lastPosition(int arr[], int size, int k){

    int start = 0;
    int end = size -1;

    int mid = start + (end - start) / 2;
    int ans = -1;

    while(start<=end){
        
        if(arr[mid] == k){
            ans = mid;
            start = mid +1;
        }
        else if(k > arr[mid]){
            // right mai jao
            start = mid +1;
        }
        else if(k < arr[mid]){
            // left mai jao
            end = mid -1;
        }
        mid = start + (end - start) / 2;
    }

    return ans;
}

int main(){
    int even[6] = {0,1,1,2,2,2};
    cout<<"fistoccurance of 2 is: "<<fistPosition(even, 6,2)<<endl;
    cout<<"lastoccurance of 2 is: "<<lastPosition(even, 6,2)<<endl;

    return 0;
}