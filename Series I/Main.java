#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  float a=0.5;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int d=pow(3,i-1);
    a=a+d;
    cout<<a<<" ";
  }
}