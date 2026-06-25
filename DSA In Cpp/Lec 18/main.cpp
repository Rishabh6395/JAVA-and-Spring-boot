// insertion Sort:

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void insertionSort(vector<int> &arr, int n){

    for(int i =1; i<n; i++){
        int temp = arr[i];
        int j = i-1;

        for(; j>=0; j--){

            if(arr[j] > temp){
                // shift
                arr[j+1] = arr[j];
            }
            else{
                break;
            }
        }
        arr[j+1] = temp;
    }
}

int main(){

    vector<int> arr = {64, 25, 12, 22, 11};
    int n = arr.size();

    insertionSort(arr, n);

    cout << "Sorted array: ";
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
