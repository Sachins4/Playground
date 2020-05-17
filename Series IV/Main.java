#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      int d=(i*i)-2;
      cout<<d<<" ";
    }
    else
    {
      int b=(i*i)-1;
      cout<<b<<" ";
    }
  }
}