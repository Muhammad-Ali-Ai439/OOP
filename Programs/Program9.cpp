#include <iostream>
using namespace std;
int main()
{
    int row, column;
    cout << "Enter number of rows: ";
    cin >> row;
    cout << "Enter number of columns: ";
    cin >> column;
    int arr[row][column];
    cout << "Enter array elements:\n";
    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < column; j++)
            cin >> arr[i][j];
    }
    int totalPrime = 0;
    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < column; j++)
        {
            int n = arr[i][j];
            int count = 0;
            if(n <= 1)
            {
                cout << n << " is Not a Prime number\n";
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
                cout << n << " is Not a Prime number\n";
            }
        }
    }
    cout << "\nTotal Prime Numbers in the Array = "
         << totalPrime << endl;
    return 0;
}
