#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int e=a+c; //30+140
  int f=b+d; //10+99
  int cent=f%100; //9
  f=f/100; //1
  int dollar=e+f; //170+1
  cout<<dollar<<endl; //171
  cout<<cent<<endl; //9
}