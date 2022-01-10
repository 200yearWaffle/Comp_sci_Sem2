// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char symbol;
int length=0;
int width=0;
int x =0;
int y =0;
cout<<"Please input a symbol";
cin>>symbol;
cout<<"Please input a width:";
cin>> width;
cout<<"Please input a length:";
cin>>length;
for(int y=0; y<length; y++){
for(int x=0; x<width; x++)
{
	gotoxy(x+5,y+6);
    cout<<symbol;
}
}
for(int z=0; z<length-2; z++){
for(int j=0; j<width-2; j++)
{
	gotoxy(j+6,z+7);
    cout<<" ";
}
}
}
