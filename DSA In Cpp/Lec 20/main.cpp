//reverse an array:

#include<iostream>
#include<vector>
using namespace std;

vector<int> reverse(vector<int>v){

    int s = 0, e = v.size()-1;

    while(s<e){
        swap(v[s], v[e]);
        s++;
        e--;
    }
    return v;

}

void printArray(vector<int>arr){

    for(int i =0; i<arr.size(); i++){
        cout<<arr[i]<<endl;
    }
}

int main(){

    vector<int> v;

    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);

    cout<<"before reverse: "<<endl;
    printArray(v);
    
    v = reverse(v);
    
    cout<<"after reverse: "<<endl;
    printArray(v);


}