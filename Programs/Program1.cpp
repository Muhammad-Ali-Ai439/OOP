#include<iostream>
using namespace std;
int main()
{
    int arr[10],flag=0,x=0;
    cout<<"Enter values in array"<<endl;
    for(int i=0; i<10; i++)
    cin>>arr[i];
    for(int j=0; j<10; j++)
    {
    if(arr[j]%2==0)
    flag++;
    }
    int arr2[flag];
    for(int k=0; k<10; k++)
        if(arr[k]%2==0)
        {
            arr2[x]=arr[k];
            x++;
        }
        for(int y=0; y<flag; y++)
        cout<<arr2[y]<<" ";
    return 0;
}

