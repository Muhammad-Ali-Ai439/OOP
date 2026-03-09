#include<iostream>
using namespace std;
void swap(int a, int b)
{
    int n;
    n=a;
    a=b;
    b=n;
    cout<<"The values after swapping are:"<<endl;
    cout<<"The value of first number:"<<a<<endl;
    cout<<"The value of second number:"<<b<<endl;
}
int main()
{
    int n,a,b;
    cout<<"Enter two numbers you want their swapping"<<endl;
    cin>>a;
    cin>>b;
    swap(a,b);
    return 0;
}
