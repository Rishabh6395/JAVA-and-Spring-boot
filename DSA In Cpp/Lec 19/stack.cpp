// stack in stl: Last in first out

#include<iostream>
#include<stack>

using namespace std;

int main(){

    stack<string>s;

    s.push("rishabh");
    s.push("bhatt");
    s.push("lol");

    cout<<"Top element: "<<s.top()<<endl;
    cout<<"Size of stack: "<<s.size()<<endl;
    s.pop();

    return 0;
}
