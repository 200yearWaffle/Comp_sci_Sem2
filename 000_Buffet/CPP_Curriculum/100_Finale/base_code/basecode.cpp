// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
gotoxy(55,6);
cout<<"Press 's' on your keyboard(press 'q' to quit program(takes a few seconds))";
gotoxy(55,7);
char mash = getch();
if(mash == 's')
{
while(kbhit()==0)
{
gotoxy(55,8);
cout<<random(10000);
}
}
gotoxy(2,2);
cout<<"           *             "<<endl;
cout<<"           ***             "<<endl;
cout<<"          *****              "<<endl;
cout<<"         *******                "<<endl;
cout<<"        *********                "<<endl;
cout<<"       ***********                  "<<endl;
cout<<"      *************                   "<<endl;
cout<<"     ***************                    "<<endl;
cout<<"           | |             "<<endl;
cout<<"           | |             "<<endl;
for(int y=0; y<2; y++)
{
for (int x =0; x<2; x++)
{
    gotoxy(x+7,y+10);
    cout<<"-";
}
}
for(int y=0; y<1; y++)
{
for (int x =0; x<6; x++)
{
    gotoxy(x+24,y+11);
    cout<<"|";
}
}
for(int y=0; y<2; y++)
{
for (int x =0; x<8; x++)
{
    gotoxy(x+15,y+10);
    cout<<"-";
}
}
for(int y=0; y<1; y++)
{
for (int x =0; x<3; x++)
{
    gotoxy(x+24,y+10);
    cout<<"/";
}
}
for(int y=0; y<2; y++)
{
for (int x =0; x<4; x++)
{
    gotoxy(x+3,y+10);
    cout<<"|";
}
}
char placeholder;
int length = 0;
int width = 0;
gotoxy(30,5);
cout<<"Framed present!";
gotoxy(30,6);
cout<<"placeholder";
cin>>placeholder;
gotoxy(30,7);
cout<<"Enter a width(1-10)";
cin>>width;
gotoxy(30,8);
cout<<"Enter a length(1-3)";
cin>>length;
for(int x3=0; x3<width; x3++)
{
        gotoxy(30+x3,10);
        cout<<'-';
        gotoxy(30+x3,9+length);
        cout<<'-';
}
for(int y3=1; y3<length; y3++)
{
    gotoxy(30,9+y3);
    cout<<'-';
    gotoxy(30+width-1,9+y3);
    cout<<'-';
}
}