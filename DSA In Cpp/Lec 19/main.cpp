// STL in cpp
// 1. ARRAYS IN STL

#include<iostream>
#include<array>
using namespace std;



int main(){

    int basic[3] =  {1,2,3};

    // array in stl:
    array<int, 4> a = {1,2,3,4};
    int size = a.size();

    for(int i =0; i<size; i++){
        cout<<a[i]<<endl;
    }

    // access particular element
    cout<<"Element in second index is: "<<a.at(2)<<endl;
    cout<<"Is array empty or not: "<<a.empty()<<endl;

    cout<<"First Element-> "<<a.front()<<endl;
    cout<<"Last Element-> "<<a.back()<<endl;

    return 0;
}
