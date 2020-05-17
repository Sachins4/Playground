#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,sum1=0,d;
  cin>>n;
  while(n>0)
  {
    d=n%10;
    if(d%2==0)
    {
      sum=sum+d;
    }
    else
    {
      sum1=sum1+d;
    }
    n=n/10;
  }
    if(sum==sum1)
      cout<<"Yes";
    else
      cout<<"No";      
}