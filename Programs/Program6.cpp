#include<iostream>
using namespace std;
void swap(int a,int b)
{
    a=a+b;
    b=a-b;
    a=a-b;
    cout<<"Your numbers after swap is a="<<a <<" b="<<b;
}
int main()
{
    int a,b;
    cout<<"Enter value of a ";
    cin>>a;
    cout<<"Enter a value of b ";
    cin>>b;
    swap(a,b);
    return 0;
}