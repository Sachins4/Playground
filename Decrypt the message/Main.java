#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a>>b;
  int num=a+b;
  for(int i=1;i<num;i++)
  {
    int div=num%i;
    if(div==0)
    sum=sum+i;
  }
  if(sum==num)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
  