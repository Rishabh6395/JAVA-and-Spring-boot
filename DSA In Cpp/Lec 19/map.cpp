// map

#include<iostream>
#include<map>
using namespace std;

int main(){

    map<int,string>m;

    m[1] = "rishabh";
    m[2] = "bhatt";
    m[3] = "lol";

    m.insert({5, "hello"});

    for(auto i: m){
        cout<<i.first<<endl;
    }

    

    
    return 0;
}