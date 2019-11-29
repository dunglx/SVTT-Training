//Hello + so doi so ham chinh+ Hien len Web
#include <stdio.h>
	int main(int argc, char *argv[])
{
	int i=0;
	printf("Content-type:text/plain\n\n");
	printf("Hello!!\n");
	printf("Number of arguments to the main function:%d\n", argc);
for(i=0;i<argc;i++)
{
	printf("argument number %d is %s\n", i, argv[i]);
}
return 0;
}
