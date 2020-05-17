#include<iostream>
using namespace std;
int main()
{
  int n,a=6,c=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    a=a+c;
    cout<<a<<" ";
    c+=5;
  }
}