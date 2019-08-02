#include<stdio.h>
int main()
{
 int i,n,e1,e2,ei1=-1,ei2=-1;
  scanf("%i",&n);
  int a[n];
  for(i=0;i<n;++i)
  {
    scanf("%i",&a[i]);
  }
  scanf("%i %i",&e1,&e2);
  for(i=0;i<n;++i)
  {
    if(a[i]==e1 )
    {
      ei1=i;
    }
  }
  for(i=0;i<n;++i)
  {
    if(a[i]==e2 )
    {
      ei2=i;
    }
  }
  printf("Element 1 index = %i \nElement 2 index = %i",ei1,ei2);
  return 0;
}