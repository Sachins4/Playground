#include<iostream>
using namespace std;
int main()
{
  float f;
  int a,b;
  cin>>f>>a>>b;
  float d=f*a;
  if(d>=b)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}