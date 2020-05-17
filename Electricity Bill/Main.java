#include<iostream>
using namespace std;
int main()
{
  int a,cost;
  cin>>a;
  if(a<=200)
  {
     cost=0.5*a;
  cout<<"Rs."<<cost;
  }
  else if(a<=400)
  {
    cost=(0.65*a)+100;
  cout<<"Rs."<<cost;
  }
  else if(a<=600)
  {
    cost=(0.8*a)+200;
  cout<<"Rs."<<cost;
  }
  else 
  {
    cost=(1.25*a)+425;
  cout<<"Rs."<<cost;
  }
}
