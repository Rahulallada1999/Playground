#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  gets(str);
  int len;
  int i;
  for(i=1;str[i]!='\0';++i)
  {
    len++;
  }
  printf("%i",len+1);
  
  return 0;
}