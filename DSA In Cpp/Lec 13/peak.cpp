// Peak index in a mountain array

#include<iostream>
#include<vector>
using namespace std;

int peakIndexInMountain(int arr[], int size){
    int s = 0;
    // int e = arr.size()-1;
    int e = size - 1;
    int mid = s+ (e - s)/2;

    while(s<e){
        if(arr[mid]<arr[mid+1]){
            s = mid+1;
        }
        else{
            e = mid;
        }
        mid = s+ (e - s)/2;
    }
    return s;

}

int main(){

    // int arr[4] ={3,4,5,1};
    int arr[8] ={3,4,5,1,10,15,1,7};

    cout<<"peak is: "<<peakIndexInMountain(arr, 8);

    return 0;
}
