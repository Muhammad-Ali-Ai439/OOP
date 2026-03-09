#include<iostream>
using namespace std;
int main()
{
    int coloumn,row;
    int x=0;
    cout<<"Enter the number of coloumn you want in array: ";
    cin>>coloumn;
    cout<<"Enter the number of rows you want in array: ";
    cin>>row;
    int arr1[row][coloumn];
    cout<<"Enter the values you want to store in array"<<endl;
    for(int a=0; a<row; a++)
    {
        for(int b=0; b<coloumn; b++)
        cin>>arr1[a][b];
    }
    cout<<"The odd numbers in the arrays are"<<endl;
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<coloumn; j++)
        if(arr1[i][j]%2!=0)
        {
            x++;
         cout<<arr1[i][j]<<" ";
        }
    }
    cout<<"The total odd values are:"<<x;
    return 0;

}