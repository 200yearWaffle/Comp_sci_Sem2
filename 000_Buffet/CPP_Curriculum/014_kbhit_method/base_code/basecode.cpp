// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int width=11;
	int length=7;
for(int x=0; x<=width; x++)
{
        gotoxy(0+x,7);
        cout<<"-";
        gotoxy(0+x,6+length);
        cout<<"-";
}
for(int y=2; y<=length; y++)
{
    gotoxy(0,6+y);
    cout<<"|";
    gotoxy(0+width,6+y);
    cout<<"|";
}
cout<<endl;
	cout<<"Press 's' on your keyboard(press 'q(2x)' to quit program(takes a few seconds))";
	char mash = getch();
	if(mash == 's')
	{
	while(kbhit()==0)
	{
	gotoxy(5,10);
	cout<<random(1000);
	}
	}
}
