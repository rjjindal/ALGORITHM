#include<iostream>
using namespace std;

int main( )
{
int a,b,c,d;
cout<<"The quadratic equation is of the type a(x2)+bx+c=0\n";
cout<<"Enter the value of a:";
cin>>a;
cout<<"Enter the value of b:";
cin>>b;
cout<<"Enter the value of c: ";
cin>>c;
d = (b*b)-4*a*c;
if((a<0)||(b<0)||(c<0)||(a>100)||(b>100)||(c>100))
cout<<"Invalid input"<<endl;
else if(a==0)
cout<<"Not a quadratic equation";
else if(d==0)
cout<<"Roots are equal";
else if(d<0)
cout<<"Imaginary roots";
else
cout<<"Real roots";
return(0);
}
