#include<iostream>
using namespace std;
int main()
{
    int a,rev=0;
    cout<<"Enter 3 values : ";
    cin>>a;
    rev=(a%10)*100;
    rev+=((a/10)%10)*10;
    rev+=a/100;
    cout<<"Reverse order is : "<<rev<<endl;
    return 0;
}