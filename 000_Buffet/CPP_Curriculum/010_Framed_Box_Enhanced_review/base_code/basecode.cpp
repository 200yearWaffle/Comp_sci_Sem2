// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int length = 0;
int width = 0;
int z=0;
int t=6;
int x1 = 0;
int y1 = 0;
cout<<"Enter a symbol";
cin>>symbol;
cout<<"Enter a width(1-10)";
cin>>width;
cout<<"Enter a length(1-10)";
cin>>length;
cout<<"Enter a x coordinate(1-10)";
cin>>x1;
cout<<"Enter a y coordinate(1-10)";
cin>>y1;
for(int x=0; x<=width; x++)
{
	
        gotoxy(z+x+x1,t+1+y1);
        cout<<symbol;
        gotoxy(z+x+x1,t+length+y1);
        cout<<symbol;
}
for(int y=2; y<=length; y++)
{
    	gotoxy(z+x1,t+y+y1);
    	cout<<symbol;
    	gotoxy(z+width+x1,t+y+y1);
    	cout<<symbol;
}
}
