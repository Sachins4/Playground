#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int a=pow(m,n);
  if(a==req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
    else if(a>req)
    {
      cout<<"Doctor, you can proceed with your experiment.";
    }
      else
      {
        cout<<"Sorry Doctor! You need more bacteria.";
      }
}
        
      