// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int length = 0;
int width=0;
int x1 =0;
int y1 = 0;
cout<<"Input a symbol";
cin>>symbol;
cout<<"please enter the width(1-10)";
cin>>length;
cout<<"please input the length(1-10)";
cin>>width;
cout<<"Please input a number(1-10)"; 
cin>>x1;
cout<<"Please input another number(1-10)";
cin>>y1;
for(int x=0; x<width; x++)
{
    for(int y=0; y<length; y++)
    {
        gotoxy(x+x1,y+6+y1);
        cout<<symbol;
    }
}
}