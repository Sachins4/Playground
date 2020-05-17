#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float f=1/sqrt(n);
  int a=(n+(n*f))+1;
  cout<<a;
}