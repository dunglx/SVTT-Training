#include <bits/stdc++.h>
using namespace std;
main(){
	char s[10]="abcd";
	char* cptr=s;
	for(int i=4;i>=0;i--)
		cout<<*(cptr+i);
	return 0;

}
