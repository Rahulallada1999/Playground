#include<stdio.h>
#include<math.h>
int main()
{
  int n,a;
  scanf("%i",&n);
  if(n==1 || n==2)
  {
    printf("%i",1);
  }
  else if(n%2==0)
  {
    n=(n/2)-1;
    a=pow(3,n);
    printf("%i",a);
  }
  else if(n%2!=0)
  {
    n=n/2;
    a=pow(2,n);
    printf("%i",a);
  }
  return 0;
}