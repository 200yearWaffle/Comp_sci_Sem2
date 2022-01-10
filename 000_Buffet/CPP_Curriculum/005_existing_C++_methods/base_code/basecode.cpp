// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int x=0;
int y=0;
int length = 0;
char orientation;
cout<<"Input a symbol"<<endl;
cin>>symbol;
cout<<"please enter a length(1-10)"<<endl;
cin>>length;
cout<<"please input the orientation(h or v or d)"<<endl;
cin>>orientation;
cout<<"Please input a number(1-10)";
cin>>x;
cout<<"Please input another number(1-10)";
cin>>y;
if(orientation=='h')
{
for(int add =0; add != length; add = add+1)
{
	x=x+1;
	gotoxy(x,y);
	cout<<symbol;
}
}
if(orientation=='v')
{
	y=4;
for(int add=0; add!=length; add = add+1)
{
	y=y+1;
	cout<<endl;
	gotoxy(x,y);
	cout<<symbol;
}
}
if(orientation=='d')
{
	y=4;
	for(int add=0; add!=length; add=add+1)
	{
		x=x+1;
		y=y+1;
		cout<<endl;
		gotoxy(x,y);
		cout<<symbol;
	}
}
}
