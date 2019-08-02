#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%i \n",&n);
  int a[n],i,e;
  for(i=0;i<n;++i)
  {
    scanf("%i",&a[i]);
  }
  scanf("\n %i",&e);
  for(i=0;i<n;++i)
  {
    if(a[i]==e)
    {
      printf("%i",i+1);
      return 0;
    }
  }
  printf("%i isn't present in the array.",e);
  return 0;
}