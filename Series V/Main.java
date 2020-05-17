#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,a=11;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    int d=pow(a,2);
    cout<<d<<" ";
    a+=4;
  }
}