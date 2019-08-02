#include<stdio.h>
int main()
{
  char ch[100];
  int n,i;
  gets(ch);
  for(i=0;ch[i]!='\0';++i)
  {
    if(ch[i]==ch[i+1])
    {
      n++;
    }
    else if(i<20)
    {
      printf("%c%i",ch[i],n+1);
      n=0;
     }
    else
    {
      printf("Invalid Input");
    }
  }
  return 0;
}
