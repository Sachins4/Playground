#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int d=75*b;
  int e=30*c;
  int f=d+e;
  if(f>a)
    cout<<"Boat will drow";
  else 
    cout<<"Boat is stable";
}