#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "c_in_linux.h"
int main(int argc, char *argv[], char *env[])
{
char* pPath;
pPath = getenv ("QUERY_STRING");
printf("Content-type:text/html\n\n<html><body bgcolor=#23abe2>\n");
char value[255] = "";

strncpy(value,(char *) getenv("QUERY_STRING"),255);
printf("QUERY_STRING : %s<BR>\n", value );
printf("<form>\n");
//call the decode_value function to get value of "ITEM1"
decode_value( "ITEM1=", (char *) &value, 255);
if(strlen(value) > 0 )
printf("<input type=\"TEXT\" name=\"ITEM1\"
value=\"%s\">\n",value);
else
printf("<input type=\"TEXT\" name=\"ITEM1\">\n");
//call the decode_value function to get value of "ITEM2"
decode_value( "ITEM2=", (char *) &value, 255);
if(strlen(value) > 0 )
printf("<input type=\"TEXT\" name=\"ITEM2\"
value=\"%s\">\n",value);
else
printf("<input type=\"TEXT\" name=\"ITEM2\">\n");
printf("<input type=\"SUBMIT\">");
printf("</form></body></html>\n");
return 0;
}
