
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

void reverseString(char ch[], int n){
    int s =0;
    int e = n-1;
    
    while(s<e){
        swap(ch[s], ch[e]);
        s++;
        e--;
    }
}

int getLength(char name[]){

    int count=0;
    for(int i =0; name[i] !='\0'; i++){
        count++;
    }

    return count;
}

int main(){

    // char name[20];
    // cout<<"Enter the name "<<endl;
    // cin>>name;

    // cout<<"Your name is: ";
    // cout<<name<<endl;

    char name[20];
    cin>>name;

    int len = getLength(name);
    cout<<"Length of the enterd string is: "<<len<<endl;
    reverseString(name,len);
    cout<<name;

    return 0;
}