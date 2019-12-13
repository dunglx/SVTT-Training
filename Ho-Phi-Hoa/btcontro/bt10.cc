#include<bits/stdc++.h>
using namespace std;
void revtString(char* ptr){
	char s[10]="abcd";
	ptr=s;	
	int n= strlen(s);
	for(int i=n;i>=0;i--)
	{
		cout<<*(ptr+i);
	}
}


int main(){
	char* ptr;
	revtString(ptr);
return 0;

}
