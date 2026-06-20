// Book allocation problem:

#include<iostream>
#include<vector>
using namespace std;

bool isPossible(vector<int> arr, int n, int students, int maxPages){
    int studentCount = 1;
    int pageSum = 0;

    for(int i =0; i<n; i++){
        if(pageSum + arr[i] <= maxPages){
            pageSum += arr[i];
        }
        else{
            studentCount++;
            if(studentCount > students || arr[i] > maxPages){
                return false;
            }
            pageSum = arr[i];
        }
    }
    return true;
}

int allocationBooks(vector<int> arr, int n, int m){
    int s = 0;
    int sum = 0;

    for(int i =0; i<n; i++){
        sum += arr[i];
    }

    int e = sum;
    int ans = 1;
    int mid = s + (e-s)/2;

    while(s<=e){
        if(isPossible(arr, n, m, mid)){
            ans = mid;
            e = mid -1;
        }
        else{
            s = mid +1;
        }
        mid = s + (e-s)/2;
    }
    return ans;

}

int main(){
    vector<int> books = {10, 20, 30, 40};
    int n = books.size();
    int students = 2;

    cout << "Minimum maximum pages: " << allocationBooks(books, n, students) << endl;
    cout << "Expected output: 60" << endl;

    return 0;
}
