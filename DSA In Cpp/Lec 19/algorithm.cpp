// algorithm

#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main(){

    vector<int>i;
    i.push_back(1);
    i.push_back(5);
    i.push_back(3);
    i.push_back(7);
    i.push_back(8);

    sort(i.begin(), i.end());

    cout<<"binary_search: "<< binary_search(i.begin(),i.end(), 3)<<endl;

    return 0;
}