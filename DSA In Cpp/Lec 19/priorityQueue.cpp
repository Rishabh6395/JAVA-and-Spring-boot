// Priority Queue:

#include<iostream>
#include<queue>
using namespace std;

int main(){

    // max heap
    priority_queue<int> maxi;

    // min heap
    priority_queue<int, vector<int>, greater<int>> mini;

    maxi.push(1);
    maxi.push(2);
    maxi.push(3);
    maxi.push(4);
    int n =maxi.size();
    for(int i =0; i<n; i++){
        cout<<"Maxi heap: " << maxi.top()<<" "<<endl;
        maxi.pop();
    }

    cout<<"mini start"<<endl;

    // mini: 
    mini.push(1);
    mini.push(2);
    mini.push(3);
    mini.push(4);
    int m =mini.size();
    for(int i =0; i<m; i++){
        cout<<"Mini heap: " << mini.top()<<" "<<endl;
        mini.pop();
    }

    cout<<"mini is empty?? "<<mini.empty()<<endl;

    return 0;
}