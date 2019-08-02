#include<stdio.h>
int main()
{
  	int a[100],max,i,n;
  scanf("%i",&n);
  for(i=0;i<n;++i)
  {
    scanf("%i ",&a[i]);
  }
  max=a[0];
  for(i=1;i<n;++i)
  {
    if(max<a[i])
    {
      max=a[i];
    }
}
  printf("%d",max);
  return 0;
}