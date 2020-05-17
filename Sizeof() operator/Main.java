#include<iostream>
using namespace std;
int main()
{
  char ch;
  int a;
  float f;
  double d;
  cin>>ch>>f>>d;
  int q=sizeof(ch);
  int w=sizeof(a);
  int e=sizeof(f);
  int r=sizeof(d);
  cout<<q<<endl;
  cout<<w<<endl;
  cout<<e<<endl;
  cout<<r<<endl;
}