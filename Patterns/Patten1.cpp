#include<iostream>
using namespace std;

void pattern(){
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            cout<<"*";
        }
        cout<<endl;
    }
}

int main(){
    pattern();
    return 0;
}