#include<stdio.h>
int main()
{
  int a[128],i,c=0;
  int n;
  scanf("%i",&n);
  while(n!=0)
  {
    a[c]=n%2;
  ++c ;
    n=n/2;
  }
  for(i=c-1;i>=0;--i)
  {
    printf("%i",a[i]);
  }
  
  return 0;
}