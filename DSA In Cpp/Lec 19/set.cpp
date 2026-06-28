// set :
// if we entered the elements in set then we can not modify it later. Set return element in sorted form

#include<iostream>
#include<set>
using namespace std;

int main(){

    set<int> s;
    s.insert(1);
    s.insert(5);
    s.insert(2);
    s.insert(8);
    for(auto i:s){
        cout<<i<<endl;
    }

    cout<<"element is present or not : "<<s.count(-5)<<endl;

    return 0;
}