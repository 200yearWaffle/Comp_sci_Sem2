// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int length = 0;
int width = 0;
cout<<"Enter a symbol";
cin>>symbol;
cout<<"Enter a width(1-10)";
cin>>width;
cout<<"Enter a length(1-10)";
cin>>length;
for(int x=0; x<=width; x++)
{
        gotoxy(0+x,6);
        cout<<symbol;
        gotoxy(0+x,5+length);
        cout<<symbol;
}
for(int y=2; y<=length; y++)
{
    gotoxy(0,5+y);
    cout<<symbol;
    gotoxy(0+width,5+y);
    cout<<symbol;
}
}
