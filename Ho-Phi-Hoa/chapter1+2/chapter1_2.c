//Hello+so doi so Ham main
#include <stdio.h>
int main(int argc, char *argv[])
{
	int i=0;
	printf("Hello\n");
	printf("Number of arguments to the main:%d\n", argc);
for(i=0; i<argc; i++)
{
	printf("argument number %d is %s\n", i, argv[i]);
}
return 0;
}
	
