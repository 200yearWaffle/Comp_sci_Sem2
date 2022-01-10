// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char symbol;
	int c1 = 0;
	int c2 = 0;
	char operation;
	cout<<"Enter a symbol";
	cin>>symbol;
	cout<<"Enter the first integer(1-10)";
	cin>>c1;
	cout<<"Enter an operation(+,-,*,/)";
	cin>>operation;
	cout<<"Enter the second integer(1-10)";
	cin>>c2;
	int width = 30;
	int length = 5;
for(int x=0; x<=width; x++)
{
        gotoxy(0+x,7);
        cout<<symbol;
        gotoxy(0+x,6+length);
        cout<<symbol;
}
for(int y=2; y<=length; y++)
{
    gotoxy(0,6+y);
    cout<<symbol;
    gotoxy(0+width,6+y);
    cout<<symbol;
}
int answer =0;
if(operation=='+')
{
gotoxy(12,9);
answer = c1+c2;
cout<<c1;
cout<<operation;
cout<<c2;
cout<<'=';
cout<<answer;
}
else if(operation=='-')
{
gotoxy(12,9);
answer = c1-c2;
cout<<c1;
cout<<operation;
cout<<c2;
cout<<'=';
cout<<answer;
}
else if(operation=='*')
{
gotoxy(12,9);
answer = c1*c2;
cout<<c1;
cout<<operation;
cout<<c2;
cout<<'=';
cout<<answer;
}
else if(operation=='/')
{
gotoxy(12,9);
answer = c1/c2;
cout<<c1;
cout<<operation;
cout<<c2;
cout<<'=';
cout<<answer;
}
}