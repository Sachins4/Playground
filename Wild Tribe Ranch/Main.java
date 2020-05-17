#include<iostream>
using namespace std;
int main()
{
  int maxw,ow;
  cin>>maxw>>ow;
  if(ow==maxw)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else if(ow<maxw)
    cout<<"Yes, you can enter.";
  else
    cout<<"Sorry, you can't enter";
}