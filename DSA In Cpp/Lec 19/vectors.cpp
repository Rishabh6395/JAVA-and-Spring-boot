// Vector in STL

// Little theroy of vector is:
/*
    if in my vector is getting full with the elements, and try to add new elements then vector internally create new array of vector paste all the elements from the old array of vector with DOUBLE THERE SIZE;
    It is Dynamic
*/

#include<iostream>
#include<vector>
using namespace std;

int main(){

    vector<int> v;

    vector<int>a(5,1); // here 5 is the size of the vector and 1 is the inital values of alloting 5 elements. Please check the below to confirm;

    for(int i:a){
        cout<<i<<" "<<endl;
    }

    cout<<"Capacity of the vector v: "<<v.capacity()<<endl;
    v.push_back(1);
    cout<<"Capacity of the vector v: "<<v.capacity()<<endl;
    v.push_back(2);
    cout<<"Capacity of the vector v: "<<v.capacity()<<endl;
    cout<<"Size of the vector v: "<<v.size()<<endl;
    v.push_back(3);
    cout<<"Capacity of the vector v: "<<v.capacity()<<endl;
    cout<<"Size of the vector v: "<<v.size()<<endl;

    cout<<"Before poping the element: "<<endl;
    for(int i:v){
        cout<<i<<" "<<endl;;
    }
    v.pop_back();
    cout<<"After poping the element: "<<endl;
    for(int i:v){
        cout<<i<<" "<<endl;
    }




    return 0;
}