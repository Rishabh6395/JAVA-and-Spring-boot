#include<iostream>
using namespace std;

// array must be sorted:

int binarySearch(int arr[], int size, int key){
    int start = 0;
    int end = size - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(arr[mid] == key){
            return mid;
        }

        if(key > arr[mid]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }

    return -1;
}


int main(){

    int odd[5] = {5,8,19,66,91};
    int even[8] = {1,2,3,4,5,6,7,8};

    int index = binarySearch(odd, 5, 91);
    cout<<index;

    return 0;
}