#include <iostream>
using namespace std;

void printArray(int arr[], int n){
    for(int i =0; i<n; i++){
        cout<<arr[i] <<" ";
    }cout<<endl;
}

void swapp(int &n, int &m){
    int temp = 0;
    temp = n;
    n = m;
    m = temp;
}

void swapAlternate(int arr[], int size){
    for(int i =0; i<size; i+=2){
        if(i+1 < size){
            swapp(arr[i], arr[i+1]);
        }
    }
    
}

int main() {
    int even[8] = {1,2,3,4,5,6,7,8};
    int odd[5] = {4,2,5,7,2};

    swapAlternate(odd, 5);
    printArray(odd, 5);


    return 0;
}