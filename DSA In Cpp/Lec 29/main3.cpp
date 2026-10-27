#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

// Kandan's Algo

int kadansAlgo (vector<int> &arr){
    int maxi = INT32_MIN;
    int prefix = 0;

    for(int i =0; i< arr.size(); i++){
        prefix += arr[i];
        maxi = max(maxi, prefix);
        if(prefix < 0)
        prefix =0;
    }
    return maxi;
}

int main(){

    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    vector<int> v(n);
    cout<<"Enter the element in an array";
    for(int i =0; i<n; i++){
        cin>>v[i];
    }

    cout<<kadansAlgo(v);

    return 0;
}