#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  cin>>w>>x>>y;
  int sp=(w*x);
  int cp=w*y+100;
  int profit=sp-cp;
  cout<<profit;
}