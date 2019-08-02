#include <stdio.h>
#include <ctype.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  if (97<=ch && ch<=122)
  {
  printf("%c",ch-32);
  }
  else
    printf("%c",ch+32);
	return 0;
}