#include<iostream>
using namespace std;
int count(int n)
{
  if(n<=0)
  {
    return 1;
  }
  return n*count(n-1);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<count(n);
  return 0;
}