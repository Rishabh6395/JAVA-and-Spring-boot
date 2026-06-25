// Queues in stl;
// First in first out

#include<iostream>
#include<queue>

using namespace std;

int main(){

    queue<string>q;

    q.push("rishabh");
    q.push("bhatt");
    q.push("lol");

    cout<<"First Element: "<<q.front()<<endl;
    q.pop();
    cout<<"After poping Element: "<<q.front()<<endl;

    
    return 0;
}