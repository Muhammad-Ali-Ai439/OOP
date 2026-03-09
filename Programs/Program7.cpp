#include<iostream>
using namespace std;
int add(int a,int b)
{
    int result;
    result=a+b;
    return result;
}
int sub(int a,int b)
{
    int result;
    result=a-b;
    return result;
}
int product(int a,int b)
{
    int result;
    result=a*b;
    return result;
}
int division(int a,int b)
{
    int result;
    result=a/b;
    return result;
}
int main()
{
int a,b;
cout<<"Enter two values :";
cin>>a>>b;
cout<<"Addition:"<<add(a,b)<<endl;
cout<<"Subtraction:"<<sub(a,b)<<endl;
cout<<"Product:"<<product(a,b)<<endl;
cout<<"Division:"<<division(a,b)<<endl;
return 0;
}
