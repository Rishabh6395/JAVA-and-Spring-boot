// List in STL:
/*
std::list is a container in the C++ Standard Template Library
that implements a doubly linked list. Each element is stored in a
node that contains pointers to the previous and next node.

Advantages:
- constant time insertion and removal at any position when iterator is known
- stable references and iterators after insert/erase of other elements
- bidirectional iteration with forward and reverse iterators

Limitations:
- not random-access; no operator[] or direct indexing
- higher memory overhead than vector because of node pointers
- slower traversal compared to contiguous containers

Common operations:
- push_back, push_front
- pop_back, pop_front
- insert, erase, splice
- front, back, size

Best use-case: when frequent insertions/removals are needed in the middle of a sequence.

*/

#include<iostream>
#include<list>

using namespace std;

int main(){
    list<int> numbers = {10, 20, 30};
    numbers.push_front(5);
    numbers.push_back(40);

    for(int value : numbers){
        cout << value << " ";
    }
    cout << endl;

    return 0;
}