#include <iostream>
using namespace std;
int main()
{
    int row, coloumn;
    cout << "Enter the number of rows: ";
    cin >> row;
    cout << "Enter the number of coloumn: ";
    cin >> coloumn;
    int arr1[row][coloumn];
    cout << "Enter the values of array:\n";
    for(int a = 0; a < row; a++)
    {
        for(int b = 0; b < coloumn; b++)
            cin >> arr1[a][b];
    }
    int totalPrime = 0;
    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < coloumn; j++)
        {
            int count = 0; 
            int n = arr1[i][j];
            if(n <= 1)
            {
                cout << n << " is Not a prime number\n";
                continue;
            }
            for(int k = 1; k <= n; k++)
            {
                if(n % k == 0)
                    count++;
            }
            if(count == 2)
            {
                cout << n << " is Prime number\n";
                totalPrime++;
            }
            else
            {
                cout << n << " is Not a prime number\n";
            }
        }
    }
    cout << "\nTotal Prime Numbers in Array = " << totalPrime << endl;
    return 0;
}
