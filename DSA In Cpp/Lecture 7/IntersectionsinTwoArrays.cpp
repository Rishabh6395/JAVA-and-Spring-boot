#include <iostream>
#include <vector>
using namespace std;


vector<int> findArrayIntersection(vector <int> &arr1, int n, vector<int> &arr2, int m){
    vector<int> ans;

    for(int i =0; i<n; i++){
        int element = arr1[i];

        for(int j =0; j<m; j++){
            if(element == arr2[j]){
                ans.push_back(element);
                arr2[j] = INT64_MIN;
                break;
            }
        }
    }
    return ans;
}

void printResult(const string& testName, vector<int>& result) {
    cout << testName << ": [";
    for (int i = 0; i < result.size(); i++) {
        cout << result[i];
        if (i + 1 < result.size()) cout << ", ";
    }
    cout << "]" << endl;
}

int main(){
    // Test 1: Common elements exist
    vector<int> a1 = {1, 2, 3, 4, 5};
    vector<int> b1 = {3, 4, 5, 6, 7};
    auto r1 = findArrayIntersection(a1, a1.size(), b1, b1.size());
    printResult("Test 1 (expect [3,4,5])", r1);

    // Test 2: No common elements
    vector<int> a2 = {1, 2, 3};
    vector<int> b2 = {4, 5, 6};
    auto r2 = findArrayIntersection(a2, a2.size(), b2, b2.size());
    printResult("Test 2 (expect [])", r2);

    // Test 3: Duplicates — each element matched only once
    vector<int> a3 = {1, 2, 2, 3};
    vector<int> b3 = {2, 2, 4};
    auto r3 = findArrayIntersection(a3, a3.size(), b3, b3.size());
    printResult("Test 3 (expect [2,2])", r3);

    // Test 4: One array empty
    vector<int> a4 = {};
    vector<int> b4 = {1, 2, 3};
    auto r4 = findArrayIntersection(a4, a4.size(), b4, b4.size());
    printResult("Test 4 (expect [])", r4);

    // Test 5: Identical arrays
    vector<int> a5 = {5, 10, 15};
    vector<int> b5 = {5, 10, 15};
    auto r5 = findArrayIntersection(a5, a5.size(), b5, b5.size());
    printResult("Test 5 (expect [5,10,15])", r5);

    return 0;
}
