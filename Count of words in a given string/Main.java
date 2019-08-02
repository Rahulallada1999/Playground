#include<stdio.h>
#include<string.h>
int main()
{
  char ch[100];
  int i,n=0;
  scanf("%[^\n]s",ch);
  for(i=0;ch[i]!='\0';++i)
  {
    if(ch[i]==' ')
    {
      n=n+1;
    }
  }
  printf("%i",n+1);
  return 0; 
}