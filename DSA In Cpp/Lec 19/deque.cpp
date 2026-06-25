// Deque in STL: a double-ended queue allowing fast insertions and deletions at both front and back.

#include<iostream>
#include<deque>
using namespace std;


int main(){

    deque<int> d;
    d.push_back(1);
    d.push_front(2);

    // d.pop_back();

    // for(int i:d){
    //     cout<<i<<" "<<endl;
    // }

    cout<<"first element index element: "<<d.at(1)<<endl;
    cout<<"Front element "<<d.front()<<endl;
    cout<<"Back element "<<d.back()<<endl;


    return 0;
}