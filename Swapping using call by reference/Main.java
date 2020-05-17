#include<iostream>
using namespace std;
int main()
{
int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  int &ref=a;
  int &ref1=b;
  cout<<"After swapping a= "<<ref1<<" and b="<<ref;
}
  