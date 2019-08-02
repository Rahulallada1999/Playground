#include<stdio.h>
int isvowel(char a)
{
  if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
  return 0;
  else 
  return 1;
}
    
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int i;
  for(i=0;str[i]!='\0';++i)
  {
    if(isvowel(str[i]))
       {
         printf("%c",str[i]);
       }
    }
    return 0;
   } 
 