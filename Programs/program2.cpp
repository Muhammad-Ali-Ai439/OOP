#include<iostream>
using namespace std;
int fact(int a)
{
    int factorial=1;
    for(int i=a; i>=1; i--)
    {
        factorial=factorial*i;
    }
    return factorial;
}
int main()
{
    int a;
    cout<<"Enter value:";
    cin>>a;
    cout<<"Factorial of given number is:"<<fact(a);
    return 0;
}
